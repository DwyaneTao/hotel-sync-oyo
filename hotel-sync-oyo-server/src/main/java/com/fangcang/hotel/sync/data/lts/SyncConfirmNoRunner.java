/**
 * Copyright (c) 2006-2015 Fangcang Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Fangcang. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Fangcang,http://www.fangcang.com.
 *  
 */
package com.fangcang.hotel.sync.data.lts;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangcang.hotel.sync.data.constants.SupplyServiceRepository;
import com.fangcang.hotel.sync.data.service.SupplyAnalyzeService;
import com.fangcang.hotel.sync.data.service.SyncConfirmNoService;
import com.fangcang.hotel.sync.data.service.lts.Register2LTSService;
import com.github.ltsopensource.core.domain.Action;
import com.github.ltsopensource.tasktracker.Result;
import com.github.ltsopensource.tasktracker.logger.BizLogger;
import com.github.ltsopensource.tasktracker.runner.JobContext;
import com.github.ltsopensource.tasktracker.runner.JobRunner;

/**
 * 同步确认号任务
 */
@Service
public class SyncConfirmNoRunner implements Register2LTSService, JobRunner {
	private static final Log logger = LogFactory.getLog(SyncConfirmNoRunner.class);
	private static final String runnerName = "syncConfirmNoRunner";
	private static final String taskName = "syncConfirmNoTask";

	@Autowired
	private SyncConfirmNoService syncConfirmNoService;

	@Override
	public Result run(JobContext jobContext) throws Throwable {
		try {
			// 业务日志记录
			BizLogger bizLogger = jobContext.getBizLogger();
			
			logger.info("启动同步确认号任务成功.");
			Map<String, SupplyAnalyzeService> map = SupplyServiceRepository.supplyAnalyzeServiceMap;
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				String supplyClass = it.next();
				syncConfirmNoService.syncConfrimNo(supplyClass);
			}
			
			// 日志会发送到 LTS (JobTracker上)
			bizLogger.info("同步确认号任务执行成功");
		} catch (Exception e) {
			logger.error("启动同步确认号任务失败，发生未知异常.", e);
			return new Result(Action.EXECUTE_EXCEPTION, e.getMessage());
		}
		return new Result(Action.EXECUTE_SUCCESS, "同步确认号任务执行成功");
	}

	@Override
	public String getJobRunnerName() {
		return runnerName;
	}

	@Override
	public String getCronExpression() {
		return "5 5 3 * * ?";
	}

	@Override
	public String getTaskId() {
		return taskName;
	}

	@Override
	public boolean isReplaceJob() {
		return false;
	}

}

package com.fangcang.hotel.sync.data.lts;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangcang.hotel.sync.data.config.SyncConfig;
import com.fangcang.hotel.sync.data.constants.SupplyServiceRepository;
import com.fangcang.hotel.sync.data.service.CacheService;
import com.fangcang.hotel.sync.data.service.SupplyAnalyzeService;
import com.fangcang.hotel.sync.data.service.lts.Register2LTSService;
import com.github.ltsopensource.core.domain.Action;
import com.github.ltsopensource.tasktracker.Result;
import com.github.ltsopensource.tasktracker.logger.BizLogger;
import com.github.ltsopensource.tasktracker.runner.JobContext;
import com.github.ltsopensource.tasktracker.runner.JobRunner;

/**
 * 2019-3-12 临时处理：每天定时全量同步【酒店/房型】到缓存
 *
 * @date 2019年3月12日
 */
@Service
public class SyncCacheMappingRunner implements Register2LTSService, JobRunner {
	private static final String runnerName = "SyncCacheMappingRunner";
	private static final String taskName = "SyncCacheMappingTask";
	private static final Log logger = LogFactory.getLog(SyncCacheMappingRunner.class);
	@Autowired
	private CacheService cacheService;
	@Override
	public Result run(JobContext jobContext) throws Throwable {
		try {
			// 业务日志记录
			BizLogger bizLogger = jobContext.getBizLogger();
			// 业务逻辑
			Map<String, SupplyAnalyzeService> map = SupplyServiceRepository.supplyAnalyzeServiceMap;
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){

				long start = System.currentTimeMillis();
				String supplyClass = it.next();
				logger.info("全量同步【酒店/房型/价格计划】到缓存: supplyClass="+supplyClass);
//				//判断是否添加到redis 还是添加到mongodb
//				if(SyncConfig.getSyncSaveMidDtoType()==1) {//保存到redis中
//					cacheService.addHotelMappingCache(supplyClass);
//					cacheService.addRoomMappingCache(supplyClass);
//					cacheService.addPricePlanMappingCache(supplyClass);
//				}else {
//					if(SyncConfig.getSyncSaveMidDtoType()==2) {//保存到mongodb中
//						cacheService.addHotelMappingMongoCache(supplyClass);
//						cacheService.addRoomMappingMongoCache(supplyClass);
//						cacheService.addPricePlanMappingMongoCache(supplyClass);
//						continue;
//					}
//					logger.error("SyncConfig中未配置syncSaveMidDtoType(保存中间件缓存类型1-redis 2-mongodb)");
//				}
				long cost = System.currentTimeMillis() - start;
				logger.info("全量同步【酒店/房型/价格计划】到缓存: supplyClass="+supplyClass +" , 耗时："+cost);
			}
			// 日志会发送到 LTS (JobTracker上)
			bizLogger.info("每天定时全量同步【酒店/房型/价格计划】到缓存任务启动成功");
		} catch (Exception e) {
			// 执行失败
			logger.info("每天定时全量同步【酒店/房型/价格计划】到缓存任务启动异常!", e);
			return new Result(Action.EXECUTE_FAILED, e.getMessage());
		}
		// 执行成功
		return new Result(Action.EXECUTE_SUCCESS, "每天定时全量同步【酒店/房型/价格计划】到缓存任务执行完成");
	}

	@Override
	public String getJobRunnerName() {
		return runnerName;
	}

	@Override
	public String getCronExpression() {
		return "0 5 1 * * ?";
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

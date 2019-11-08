package com.fangcang.hotel.sync.oyo.api.request.directProduct;

import java.util.List;

/**
 * 价格计划查询
 * @author guodingcheng
 * @date 2019/11/4 19:33
 **/
public class GetRatePlanInfosRequest {

    /**
     * 价格计划参数(必传)
     */
    private Object ratePlanParam;

    /**
     * 价格计划id，为空则返回所有价格计划
     */
    private List<Long> ratePlanIds;

    public Object getRatePlanParam() {
        return ratePlanParam;
    }

    public void setRatePlanParam(Object ratePlanParam) {
        this.ratePlanParam = ratePlanParam;
    }

    public List<Long> getRatePlanIds() {
        return ratePlanIds;
    }

    public void setRatePlanIds(List<Long> ratePlanIds) {
        this.ratePlanIds = ratePlanIds;
    }
}

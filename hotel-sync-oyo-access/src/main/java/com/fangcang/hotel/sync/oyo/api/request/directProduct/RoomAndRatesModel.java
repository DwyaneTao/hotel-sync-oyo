package com.fangcang.hotel.sync.oyo.api.request.directProduct;

import java.util.List;

/**
 * @author guodingcheng
 * @date 2019/11/4 19:43
 **/
public class RoomAndRatesModel {

    /**
     * 房型id(必传)
     */
    private Long roomTypeId;

    /**
     * 价格计划id，为空则返回所有价格计划
     */
    private List<Long> ratePlanIds;

    /**
     * 日期表达式
     */
    private String dateExpression;

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public List<Long> getRatePlanIds() {
        return ratePlanIds;
    }

    public void setRatePlanIds(List<Long> ratePlanIds) {
        this.ratePlanIds = ratePlanIds;
    }

    public String getDateExpression() {
        return dateExpression;
    }

    public void setDateExpression(String dateExpression) {
        this.dateExpression = dateExpression;
    }
}

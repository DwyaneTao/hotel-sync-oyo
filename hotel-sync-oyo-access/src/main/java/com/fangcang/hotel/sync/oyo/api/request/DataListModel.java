package com.fangcang.hotel.sync.oyo.api.request;

import com.fangcang.hotel.sync.oyo.api.request.directProduct.RoomAndRatesModel;
import com.fangcang.hotel.sync.oyo.constants.OrderStatusEnum;

import java.util.List;

/**
 * 通知数据
 * @author guodingcheng
 * @date 2019/11/4 20:21
 **/
public class DataListModel {

    /**
     * 酒店唯一code
     */
    private String uniqueCode;

    /**
     *
     */
    private List<RoomAndRatesModel> roomAndRates;

    /**
     * 价格计划id（表示价格计划变更）
     */
    private Long ratePlanId;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public List<RoomAndRatesModel> getRoomAndRates() {
        return roomAndRates;
    }

    public void setRoomAndRates(List<RoomAndRatesModel> roomAndRates) {
        this.roomAndRates = roomAndRates;
    }

    public Long getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
    }
}

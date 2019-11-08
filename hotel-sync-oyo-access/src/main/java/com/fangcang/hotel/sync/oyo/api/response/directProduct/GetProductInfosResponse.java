package com.fangcang.hotel.sync.oyo.api.response.directProduct;

import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;

import java.util.List;

/**
 * 商品查询响应参数
 * @author guodingcheng
 * @date 2019/11/4 21:29
 **/
public class GetProductInfosResponse extends BusinessResponse {

    /**
     * 酒店唯一code(必传)
     */
    private String uniqueCode;

    /**
     * 房型id(必传)
     */
    private Long roomTypeId;

    /**
     * 价格计划id(必传)
     */
    private Long ratePlanId;

    /**
     * 活动code
     */
    private String activityCode;

    /**
     * 价格日历(必传)
     */
    private List<InventoryPricesModel> inventoryPrices;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Long getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public List<InventoryPricesModel> getInventoryPrices() {
        return inventoryPrices;
    }

    public void setInventoryPrices(List<InventoryPricesModel> inventoryPrices) {
        this.inventoryPrices = inventoryPrices;
    }
}

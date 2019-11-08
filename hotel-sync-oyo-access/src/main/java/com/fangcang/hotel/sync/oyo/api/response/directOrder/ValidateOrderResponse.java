package com.fangcang.hotel.sync.oyo.api.response.directOrder;

import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;
import com.fangcang.hotel.sync.oyo.api.response.directProduct.InventoryPricesModel;

import java.util.List;

/**
 * 预下单校验响应参数
 * @author guodingcheng
 * @date 2019/11/4 21:36
 **/
public class ValidateOrderResponse extends BusinessResponse {

    /**
     * ota订单编号
     */
    private String extBookingSn;

    /**
     * 请求roomTypeId(必传)
     */
    private Long roomTypeId;

    /**
     * 请求ratePlanId(必传)
     */
    private Long ratePlanId;

    /**
     * 价格日历，返回正确的价格，库存信息
     */
    private List<InventoryPricesModel> inventoryPrices;

    public String getExtBookingSn() {
        return extBookingSn;
    }

    public void setExtBookingSn(String extBookingSn) {
        this.extBookingSn = extBookingSn;
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

    public List<InventoryPricesModel> getInventoryPrices() {
        return inventoryPrices;
    }

    public void setInventoryPrices(List<InventoryPricesModel> inventoryPrices) {
        this.inventoryPrices = inventoryPrices;
    }
}

package com.fangcang.hotel.sync.oyo.api.response.directOrder;

import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;
import com.fangcang.hotel.sync.oyo.api.response.directProduct.InventoryPricesModel;

import java.util.List;

/**
 * 创建订单响应参数
 * @author guodingcheng
 * @date 2019/11/4 21:40
 **/
public class CreateOrderResponse extends BusinessResponse {

    /**
     * ota订单id(必传)
     */
    private String extBookingSn;

    /**
     * 确认订单编号
     */
    private String orderId;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<InventoryPricesModel> getInventoryPrices() {
        return inventoryPrices;
    }

    public void setInventoryPrices(List<InventoryPricesModel> inventoryPrices) {
        this.inventoryPrices = inventoryPrices;
    }
}

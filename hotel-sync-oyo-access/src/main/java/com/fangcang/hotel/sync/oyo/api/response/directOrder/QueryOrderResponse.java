package com.fangcang.hotel.sync.oyo.api.response.directOrder;

import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;

/**
 * 查询订单响应参数
 * @author guodingcheng
 * @date 2019/11/4 21:44
 **/
public class QueryOrderResponse extends BusinessResponse {

    /**
     * ota订单ID(必传)
     */
    private String extBookingSn;

    /**
     * 订单状态(必传)
     */
    private String orderStatus;

    /**
     * 确认订单号(必传)
     */
    private String orderId;

    /**
     * 酒店编号(必传)
     */
    private String uniqueCode;

    public String getExtBookingSn() {
        return extBookingSn;
    }

    public void setExtBookingSn(String extBookingSn) {
        this.extBookingSn = extBookingSn;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
}

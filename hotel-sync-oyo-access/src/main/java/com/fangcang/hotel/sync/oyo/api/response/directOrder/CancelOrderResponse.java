package com.fangcang.hotel.sync.oyo.api.response.directOrder;

import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;

/**
 * 取消订单响应参数
 * @author guodingcheng
 * @date 2019/11/4 21:43
 **/
public class CancelOrderResponse extends BusinessResponse {

    /**
     * 订单ID(必穿)
     */
    private String extBookingSn;

    /**
     * 取消订单失败错误信息
     */
    private String message;

    public String getExtBookingSn() {
        return extBookingSn;
    }

    public void setExtBookingSn(String extBookingSn) {
        this.extBookingSn = extBookingSn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

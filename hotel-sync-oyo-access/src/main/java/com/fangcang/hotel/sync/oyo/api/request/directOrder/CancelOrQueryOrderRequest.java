package com.fangcang.hotel.sync.oyo.api.request.directOrder;

/**
 * 取消订单/查询订单
 * @author guodingcheng
 * @date 2019/11/4 20:15
 **/
public class CancelOrQueryOrderRequest {

    /**
     * 酒店唯一编号(必传)
     */
    private String uniqueCode;

    /**
     * ota订单编号(必传)
     */
    private String extBookingSn;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getExtBookingSn() {
        return extBookingSn;
    }

    public void setExtBookingSn(String extBookingSn) {
        this.extBookingSn = extBookingSn;
    }
}

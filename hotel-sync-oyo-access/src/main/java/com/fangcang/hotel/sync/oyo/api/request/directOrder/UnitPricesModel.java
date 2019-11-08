package com.fangcang.hotel.sync.oyo.api.request.directOrder;

import java.math.BigDecimal;

/**
 * @author guodingcheng
 * @date 2019/11/4 19:55
 **/
public class UnitPricesModel {

    /**
     * 价格日期：yyyy-MM-dd(必传)
     */
    private String date;

    /**
     * 每日价格，单位：元(必传)
     */
    private BigDecimal price;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

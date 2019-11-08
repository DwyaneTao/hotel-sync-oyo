package com.fangcang.hotel.sync.oyo.api.response.directProduct;

import java.math.BigDecimal;

/**
 * 价格日历
 * @author guodingcheng
 * @date 2019/11/4 21:31
 **/
public class InventoryPricesModel {

    /**
     * 日期(必传)
     */
    private String date;

    /**
     * 价格，单位：元(必传)
     */
    private BigDecimal price;

    /**
     * 库存(必传)
     */
    private Integer stock;

    /**
     * 开关房状态，1表示开房，0表示关房。默认值1(必传)
     */
    private Integer status;

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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

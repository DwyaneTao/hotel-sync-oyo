package com.fangcang.hotel.sync.oyo.api.request.directOrder;

import java.math.BigDecimal;
import java.util.List;

/**
 * 预下单校验
 * @author guodingcheng
 * @date 2019/11/4 19:48
 **/
public class ValidateOrderRequest {

    /**
     * 酒店编号(必传)
     */
    private String uniqueCode;

    /**
     * 房型Id(必传)
     */
    private Long roomTypeId;

    /**
     * 活动code
     */
    private String activityCode;

    /**
     * ota订单编号
     */
    private String extBookingSn;

    /**
     * 价格策略id(必传)
     */
    private Long ratePlanId;

    /**
     * 房间数量，取值：1-9(必传)
     */
    private Integer roomNum;

    /**
     * 入住日期，格式：yyyy-MM-dd(必传)
     */
    private String checkInDate;

    /**
     * 离店日期，格式：yyyy-MM-dd(必传)
     */
    private String checkOutDate;

    /**
     * 是否校验每日间夜价格（1:是，2:否），与totalPriceVerify不能同时为2(必传)
     */
    private Integer unitPriceVerify;

    /**
     * unitPriceVerify=1，必填(必传)
     */
    private List<UnitPricesModel> unitPrices;

    /**
     * 是否校验订单总价格（1:是，2:否），与unitPriceVerify不能同时为2(必传)
     */
    private Integer totalPriceVerify;

    /**
     * totalPriceVerify=1，必填 总价，单位：元(必传)
     */
    private BigDecimal totalPrice;

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

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getExtBookingSn() {
        return extBookingSn;
    }

    public void setExtBookingSn(String extBookingSn) {
        this.extBookingSn = extBookingSn;
    }

    public Long getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getUnitPriceVerify() {
        return unitPriceVerify;
    }

    public void setUnitPriceVerify(Integer unitPriceVerify) {
        this.unitPriceVerify = unitPriceVerify;
    }

    public List<UnitPricesModel> getUnitPrices() {
        return unitPrices;
    }

    public void setUnitPrices(List<UnitPricesModel> unitPrices) {
        this.unitPrices = unitPrices;
    }

    public Integer getTotalPriceVerify() {
        return totalPriceVerify;
    }

    public void setTotalPriceVerify(Integer totalPriceVerify) {
        this.totalPriceVerify = totalPriceVerify;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}

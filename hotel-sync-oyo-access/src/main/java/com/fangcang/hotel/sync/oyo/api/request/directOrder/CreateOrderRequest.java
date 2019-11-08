package com.fangcang.hotel.sync.oyo.api.request.directOrder;

import java.math.BigDecimal;
import java.util.List;

/**
 * 创建订单
 * @author guodingcheng
 * @date 2019/11/4 20:00
 **/
public class CreateOrderRequest {

    /**
     * 酒店编号(必传)
     */
    private String uniqueCode;

    /**
     * 房型ID(必传)
     */
    private Long roomTypeId;

    /**
     * 价格计划id(必传)
     */
    private Long ratePlanId;

    /**
     * ota订单编号(必传)
     */
    private String extBookingSn;

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
     * 活动code
     */
    private String activityCode;

    /**
     * 早餐数量(必传)
     */
    private Integer breakfastNum;

    /**
     * 是否校验每日间夜价格（1:是，2:否），与totalPriceVerify不能同时为2(必传)
     */
    private Integer unitPriceVerify;

    /**
     * 活动前单价，单位：元(必传)
     */
    private List<UnitPricesModel> unitPrices;

    /**
     * 是否校验订单总价格（1:是，2:否），与unitPriceVerify不能同时为2(必传)
     */
    private Integer totalPriceVerify;

    /**
     * 活动前总价，单位：元(必传)
     */
    private BigDecimal totalPrice;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 支付方式 1:预付, 5:面付, 6:信用住(必传)
     */
    private Integer paymentType;

    /**
     * 最早到店时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String earliestArriveTime;

    /**
     * 最晚到店时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String latestArriveTime;

    /**
     * 预定人信息(必传)
     */
    private List<PersonsModel> persons;

    /**
     * 联系人姓名(必传)
     */
    private String guestName;

    /**
     * 联系人电话(必传)
     */
    private String guestPhone;

    /**
     * 备注（不做预订判断）
     */
    private String remark;

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

    public String getExtBookingSn() {
        return extBookingSn;
    }

    public void setExtBookingSn(String extBookingSn) {
        this.extBookingSn = extBookingSn;
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

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getBreakfastNum() {
        return breakfastNum;
    }

    public void setBreakfastNum(Integer breakfastNum) {
        this.breakfastNum = breakfastNum;
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

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getEarliestArriveTime() {
        return earliestArriveTime;
    }

    public void setEarliestArriveTime(String earliestArriveTime) {
        this.earliestArriveTime = earliestArriveTime;
    }

    public String getLatestArriveTime() {
        return latestArriveTime;
    }

    public void setLatestArriveTime(String latestArriveTime) {
        this.latestArriveTime = latestArriveTime;
    }

    public List<PersonsModel> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonsModel> persons) {
        this.persons = persons;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

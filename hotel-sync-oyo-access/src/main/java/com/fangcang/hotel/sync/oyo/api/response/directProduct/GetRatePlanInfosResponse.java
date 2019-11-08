package com.fangcang.hotel.sync.oyo.api.response.directProduct;

import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;

/**
 * 价格计划查询响应参数
 * @author guodingcheng
 * @date 2019/11/4 21:20
 **/
public class GetRatePlanInfosResponse extends BusinessResponse {

    /**
     * 价格计划id(必传)
     */
    private Long ratePlanId;

    /**
     * 价格计划name(必传)
     */
    private String ratePlanName;

    /**
     * 活动code
     */
    private String activityCode;

    /**
     * 早餐数量(必传)
     */
    private Integer breakfastNum;

    /**
     * 支付类型，1：预付；2：现付；3：信用住(必传)
     */
    private Integer paymentType;

    /**
     * 最早提前预定天数，默认值0
     */
    private Integer earliestBookingDays;

    /**
     * 最早提前预定小时，默认值0
     */
    private Integer earliestBookingHours;

    /**
     * 最小连住天数，0表示不限制
     */
    private Integer serialCheckinMin;

    /**
     * 最小预定间数，0表示不限制
     */
    private Integer roomCountMin;

    /**
     * 是否允许取消，0：限时取消；1：可以取消，默认值0(必传)
     */
    private Integer allowCancel;

    /**
     * 提前取消的天数，默认值0
     */
    private Integer moveupCancelDays;

    /**
     * 提前取消的时间，默认值0
     */
    private Integer moveupCancelHours;

    /**
     * 担保策略，1：无担保；2：全天首晚担保；3：全天全额担保
     */
    private Integer guaranteeType;

    public Long getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    public String getRatePlanName() {
        return ratePlanName;
    }

    public void setRatePlanName(String ratePlanName) {
        this.ratePlanName = ratePlanName;
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

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getEarliestBookingDays() {
        return earliestBookingDays;
    }

    public void setEarliestBookingDays(Integer earliestBookingDays) {
        this.earliestBookingDays = earliestBookingDays;
    }

    public Integer getEarliestBookingHours() {
        return earliestBookingHours;
    }

    public void setEarliestBookingHours(Integer earliestBookingHours) {
        this.earliestBookingHours = earliestBookingHours;
    }

    public Integer getSerialCheckinMin() {
        return serialCheckinMin;
    }

    public void setSerialCheckinMin(Integer serialCheckinMin) {
        this.serialCheckinMin = serialCheckinMin;
    }

    public Integer getRoomCountMin() {
        return roomCountMin;
    }

    public void setRoomCountMin(Integer roomCountMin) {
        this.roomCountMin = roomCountMin;
    }

    public Integer getAllowCancel() {
        return allowCancel;
    }

    public void setAllowCancel(Integer allowCancel) {
        this.allowCancel = allowCancel;
    }

    public Integer getMoveupCancelDays() {
        return moveupCancelDays;
    }

    public void setMoveupCancelDays(Integer moveupCancelDays) {
        this.moveupCancelDays = moveupCancelDays;
    }

    public Integer getMoveupCancelHours() {
        return moveupCancelHours;
    }

    public void setMoveupCancelHours(Integer moveupCancelHours) {
        this.moveupCancelHours = moveupCancelHours;
    }

    public Integer getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(Integer guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
}

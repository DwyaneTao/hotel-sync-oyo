package com.fangcang.hotel.sync.oyo.constants;

/**
 * 支付类型
 * @author guodingcheng
 * @date 2019/11/5 9:26
 **/
public enum PaymentTypeEnum {


    PAY_IN_ADVANCE(1,"预付"),
    CASH_ON_HAND(2,"现付"),
    CREDIT_STANDING(3,"信用住");

    public int key;
    public String value;
    private PaymentTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static String getValueByKey(int key) {
        for(PaymentTypeEnum paymentTypeEnum : PaymentTypeEnum.values()) {
            if(paymentTypeEnum.key == key) {
                return paymentTypeEnum.value;
            }
        }
        return null;
    }
}

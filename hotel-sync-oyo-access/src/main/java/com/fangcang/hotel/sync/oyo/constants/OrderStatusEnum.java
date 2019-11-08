package com.fangcang.hotel.sync.oyo.constants;

/**
 * 订单状态 （未完成）
 * @author guodingcheng
 * @date 2019/11/5 9:28
 **/
public enum OrderStatusEnum {

    VALIDATE_SUCCESS("VALIDATE_SUCCESS","订单校验成功"),
    VALIDATE_FAIL("VALIDATE_FAIL","订单校验失败"),
    BOOK_SUCCESS("BOOK_SUCCESS","预定成功"),
    BOOK_FAIL("BOOK_FAIL","预定失败"),
    CANCEL_SUCCESS("CANCEL_SUCCESS","取消成功"),
    CANCEL_FAIL("CANCEL_FAIL","取消失败");

    public String key;
    public String value;
    private OrderStatusEnum(String key,String value) {
        this.key = key;
        this.value = value;
    }


}

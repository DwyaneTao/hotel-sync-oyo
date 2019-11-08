package com.fangcang.hotel.sync.oyo.constants;

/**
 * 数据变更类型 （未完成）
 * @author guodingcheng
 * @date 2019/11/5 9:29
 **/
public enum  ChangeTypeEnum {

    ONLINE("ONLINE"),
    CHANGED("CHANGED"),
    OFFLINE("OFFLINE"),
    ROOM_CLOSED("ROOM_CLOSED"),
    SOLD_OUT("SOLD_OUT");

    public String value;

   private ChangeTypeEnum(String value) {
       this.value = value;
    }
}

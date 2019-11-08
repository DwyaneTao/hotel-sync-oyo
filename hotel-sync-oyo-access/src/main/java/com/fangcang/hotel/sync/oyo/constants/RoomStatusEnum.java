package com.fangcang.hotel.sync.oyo.constants;

/**
 * 房间状态
 * @author guodingcheng
 * @date 2019/11/5 9:28
 **/
public enum RoomStatusEnum {

    CLOSED_ROOM(0,"关房"),
    GET_ROOM(1,"开房");

    public int key;
    public String value;


    private RoomStatusEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(int key) {
        for(RoomStatusEnum roomStatusEnum : RoomStatusEnum.values()) {
            if(roomStatusEnum.key == key) {
                return roomStatusEnum.value;
            }
        }
        return null;
    }
}

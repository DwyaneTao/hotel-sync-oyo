package com.fangcang.hotel.sync.oyo.constants;

/**
 * 证件类型
 * @author guodingcheng
 * @date 2019/11/5 9:28
 **/
public enum IDTypeEnum {

    ID(1,"身份证"),
    PASSPORT(2,"护照");

    public int key;
    public String value;

    private IDTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(int key) {
        for(IDTypeEnum idTypeEnum : IDTypeEnum.values()) {
            if(idTypeEnum.key == key) {
                return idTypeEnum.value;
            }
        }
        return null;
    }
}

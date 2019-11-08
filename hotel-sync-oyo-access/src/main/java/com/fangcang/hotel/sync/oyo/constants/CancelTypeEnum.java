package com.fangcang.hotel.sync.oyo.constants;

/**
 * 取消类型
 * @author guodingcheng
 * @date 2019/11/5 9:27
 **/
public enum CancelTypeEnum {

    LIMITED_TIME_CACELLATION(0,"限时取消"),
    MAY_CANCEL(1,"可以取消");

    public int key;
    public String value;

    private CancelTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(int key) {
        for(CancelTypeEnum cancelTypeEnum : CancelTypeEnum.values()) {
            if(cancelTypeEnum.key == key) {
                return cancelTypeEnum.value;
            }
        }
        return null;
    }
}

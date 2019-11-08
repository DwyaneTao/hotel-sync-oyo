package com.fangcang.hotel.sync.oyo.constants;

/**
 * 担保类型
 * @author guodingcheng
 * @date 2019/11/5 9:28
 **/
public enum GuaranteeTypeEnum {


    UNSECURED(1,"无担保"),
    GUARANTEE_FIRST_NIGHT(2,"全天首晚担保"),
    FULL_DAY_GUARANTEE(3,"全天全额担保");

    public int key;
    public String value;

    private GuaranteeTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static String getValueByKey(int key) {
        for(GuaranteeTypeEnum guaranteeTypeEnum : GuaranteeTypeEnum.values()) {
            if(guaranteeTypeEnum.key == key) {
                return guaranteeTypeEnum.value;
            }
        }
        return null;
    }
}

package com.fangcang.hotel.sync.oyo.constants;

/**
 * 图片类型
 * @author guodingcheng
 * @date 2019/11/5 9:26
 **/
public enum ImageTypeEnum {

        HOTELIMG(1,"酒店图片"),
        RoomTypeIMG(2,"房型图片");

    public int key;
    public String value;
    private ImageTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValueByKey(int key) {
        for(ImageTypeEnum imageTypeEnum : ImageTypeEnum.values()) {
            if(imageTypeEnum.key == key) {
                return imageTypeEnum.value;
            }
        }
        return null;
    }
}

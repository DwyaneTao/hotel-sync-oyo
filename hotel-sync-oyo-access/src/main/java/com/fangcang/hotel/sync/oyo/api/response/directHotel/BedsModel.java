package com.fangcang.hotel.sync.oyo.api.response.directHotel;

/**
 * 床型
 * @author guodingcheng
 * @date 2019/11/4 21:14
 **/
public class BedsModel {

    /**
     * 床型名称(必传)
     */
    private String name;

    /**
     * 床型尺寸(必传)
     */
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

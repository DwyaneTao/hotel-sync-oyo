package com.fangcang.hotel.sync.oyo.api.request.directHotel;

import java.util.List;

/**
 * 酒店信息查询
 * @author guodingcheng
 * @date 2019/11/4 18:14
 **/
public class GetHotelInfosRequest  {

    /**
     * 酒店参数对象(必传)
     */
    private Object hotelParam;

    /**
     * 酒店唯一code，0< uniqueCodes <=5(必传)
     */
    private List<String> uniqueCodes;

    public Object getHotelParam() {
        return hotelParam;
    }

    public void setHotelParam(Object hotelParam) {
        this.hotelParam = hotelParam;
    }

    public List<String> getUniqueCodes() {
        return uniqueCodes;
    }

    public void setUniqueCodes(List<String> uniqueCodes) {
        this.uniqueCodes = uniqueCodes;
    }
}

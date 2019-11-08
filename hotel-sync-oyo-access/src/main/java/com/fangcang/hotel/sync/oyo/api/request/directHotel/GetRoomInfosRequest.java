package com.fangcang.hotel.sync.oyo.api.request.directHotel;

import java.util.List;

/**
 * 房型信息查询
 * @author guodingcheng
 * @date 2019/11/4 19:26
 **/
public class GetRoomInfosRequest {

    /**
     * 房型参数(必传)
     */
    private Object roomTypeParam;

    /**
     * 房型数组，0 < 数量 <= 5(必传)
     */
    private List<HotelAndRoomsModel> hotelAndRooms;



    public Object getRoomTypeParam() {
        return roomTypeParam;
    }

    public void setRoomTypeParam(Object roomTypeParam) {
        this.roomTypeParam = roomTypeParam;
    }

    public List<HotelAndRoomsModel> getHotelAndRooms() {
        return hotelAndRooms;
    }

    public void setHotelAndRooms(List<HotelAndRoomsModel> hotelAndRooms) {
        this.hotelAndRooms = hotelAndRooms;
    }
}

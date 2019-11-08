package com.fangcang.hotel.sync.oyo.api.request.directHotel;

import java.util.List;

/**
 * @author guodingcheng
 * @date 2019/11/4 19:46
 **/
public class HotelAndRoomsModel {

    /**
     * 酒店唯一code(必传)
     */
    private String uniqueCode;

    /**
     * 房型ids，如果房型ids为空，则查询酒店下的所有房型
     */
    private List<Long> roomTypeIds;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public List<Long> getRoomTypeIds() {
        return roomTypeIds;
    }

    public void setRoomTypeIds(List<Long> roomTypeIds) {
        this.roomTypeIds = roomTypeIds;
    }
}

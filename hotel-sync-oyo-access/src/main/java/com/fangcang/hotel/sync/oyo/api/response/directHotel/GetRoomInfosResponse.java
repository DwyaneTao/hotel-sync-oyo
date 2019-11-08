package com.fangcang.hotel.sync.oyo.api.response.directHotel;

import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;

import java.util.List;

/**
 * 房型信息查询响应参数
 * @author guodingcheng
 * @date 2019/11/4 21:06
 **/
public class GetRoomInfosResponse extends BusinessResponse {

    /**
     * 酒店唯一code(必传)
     */
    private String uniqueCode;

    /**
     * 房型列表(必传)
     */
    private List<RoomInfosModel> roomInfos;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public List<RoomInfosModel> getRoomInfos() {
        return roomInfos;
    }

    public void setRoomInfos(List<RoomInfosModel> roomInfos) {
        this.roomInfos = roomInfos;
    }
}

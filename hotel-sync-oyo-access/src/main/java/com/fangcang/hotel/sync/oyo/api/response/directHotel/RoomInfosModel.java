package com.fangcang.hotel.sync.oyo.api.response.directHotel;

import java.util.List;

/**
 * 房型列表
 * @author guodingcheng
 * @date 2019/11/4 21:08
 **/
public class RoomInfosModel {

    /**
     * 房型id(必传)
     */
    private Long roomTypeId;

    /**
     * 房型名称(必传)
     */
    private String roomName;

    /**
     * 房型客房数量
     */
    private Integer roomCount;

    /**
     * 楼层
     */
    private String floor;

    /**
     * 面积(必传)
     */
    private String area;

    /**
     * 床型(必传)
     */
    private List<BedsModel> beds;

    /**
     * 房型设施(必传)
     */
    private String facilities;

    /**
     * 酒店图片
     */
    private List<ImgsModel> imgs;

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<BedsModel> getBeds() {
        return beds;
    }

    public void setBeds(List<BedsModel> beds) {
        this.beds = beds;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public List<ImgsModel> getImgs() {
        return imgs;
    }

    public void setImgs(List<ImgsModel> imgs) {
        this.imgs = imgs;
    }
}

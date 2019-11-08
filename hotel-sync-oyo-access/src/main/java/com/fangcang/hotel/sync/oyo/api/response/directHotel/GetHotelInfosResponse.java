package com.fangcang.hotel.sync.oyo.api.response.directHotel;


import com.fangcang.hotel.sync.oyo.api.response.BusinessResponse;

import java.util.List;

/**
 * 酒店信息查询响应参数
 * @author guodingcheng
 * @date 2019/11/4 20:50
 **/
public class GetHotelInfosResponse extends BusinessResponse {

    /**
     * 酒店code(必传)
     */
    private String uniqueCode;

    /**
     * 酒店名称(必传)
     */
    private String hotelName;

    /**
     * 酒店所在省对应的编码(必传)
     */
    private String provinceCode;

    /**
     * 酒店所在城市对应的编码(必传)
     */
    private String cityCode;

    /**
     * 酒店所在县对应的编码(必传)
     */
    private String districtCode;

    /**
     * 酒店地址(必传)
     */
    private String address;

    /**
     * 酒店电话(必传)
     */
    private String tel;

    /**
     * 酒店设施(必传)
     */
    private List<Integer> facilities;

    /**
     * 酒店图片
     */
    private List<ImgsModel> imgs;

    /**
     * 经度(必传)
     */
    private String longitude;

    /**
     * 纬度(必传)
     */
    private String latitude;

    /**
     * 开业日期
     */
    private String openingDate;

    /**
     * 最新装修日期
     */
    private String decorateDate;

    /**
     * 酒店客房数量，最小值：1；最大值：9999(必传)
     */
    private Integer roomCount;

    /**
     * 酒店描述
     */
    private String description;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Integer> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Integer> facilities) {
        this.facilities = facilities;
    }

    public List<ImgsModel> getImgs() {
        return imgs;
    }

    public void setImgs(List<ImgsModel> imgs) {
        this.imgs = imgs;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getDecorateDate() {
        return decorateDate;
    }

    public void setDecorateDate(String decorateDate) {
        this.decorateDate = decorateDate;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.fangcang.hotel.sync.oyo.api.response.directHotel;

/**
 * 酒店图片
 * @author guodingcheng
 * @date 2019/11/4 20:46
 **/
public class ImgsModel {

    /**
     * 图片地址
     */
    private String url;

    /**
     * 是否是主图
     */
    private Integer isMain;

    /**
     * 图片类型
     */
    private String type;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIsMain() {
        return isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

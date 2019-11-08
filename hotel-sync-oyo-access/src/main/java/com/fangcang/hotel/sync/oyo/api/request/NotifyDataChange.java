package com.fangcang.hotel.sync.oyo.api.request;

import java.util.List;

/**
 * 数据变更
 * @author guodingcheng
 * @date 2019/11/4 20:20
 **/
public class NotifyDataChange {

    /**
     * 变更类型，eg. ONLINE, CHANGED, OFFLINE，ROOM_CLOSED，SOLD_OUT(必传)
     */
    private String changeType;

    /**
     * 数据类型，eg. HOTEL, ROOM_TYPE, RATE_PLAN, PRODUCT(必传)
     */
    private String dataType;

    /**
     * 通知数据(必传)
     */
    private List<DataListModel> dataList;

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public List<DataListModel> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataListModel> dataList) {
        this.dataList = dataList;
    }
}

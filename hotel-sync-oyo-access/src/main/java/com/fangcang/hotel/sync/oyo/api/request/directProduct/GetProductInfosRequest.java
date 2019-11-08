package com.fangcang.hotel.sync.oyo.api.request.directProduct;

import java.util.List;

/**
 * 商品查询
 * @author guodingcheng
 * @date 2019/11/4 19:35
 **/
public class GetProductInfosRequest {

    /**
     * 商品参数(必传)
     */
    private Object productParam;

    /**
     * 酒店唯一code(必传)
     */
    private String uniqueCode;

    /**
     *            (必传)
     */
    private List<RoomAndRatesModel> roomAndRates;


    public Object getProductParam() {
        return productParam;
    }

    public void setProductParam(Object productParam) {
        this.productParam = productParam;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public List<RoomAndRatesModel> getRoomAndRates() {
        return roomAndRates;
    }

    public void setRoomAndRates(List<RoomAndRatesModel> roomAndRates) {
        this.roomAndRates = roomAndRates;
    }
}

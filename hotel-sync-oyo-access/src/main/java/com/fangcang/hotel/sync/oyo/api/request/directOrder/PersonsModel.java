package com.fangcang.hotel.sync.oyo.api.request.directOrder;

/**
 * 预定人信息
 * @author guodingcheng
 * @date 2019/11/4 20:09
 **/
public class PersonsModel {

    /**
     * 预定人姓名(必传)
     */
    private String name;

    /**
     * 证件类型，1：身份证；2：护照
     */
    private Integer idType;

    /**
     * 证件号码
     */
    private String idNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}

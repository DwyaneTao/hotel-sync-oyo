package com.fangcang.hotel.sync.oyo.api.response;

/**
 * 通用响应参数
 * @author py
 * @date 2019/11/4 18:04
 **/
public class Response <T extends BusinessResponse>  {

    /**
     * 请求是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应描述信息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

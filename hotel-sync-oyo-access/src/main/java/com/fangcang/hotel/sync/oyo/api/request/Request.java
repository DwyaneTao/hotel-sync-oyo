package com.fangcang.hotel.sync.oyo.api.request;

/**
 * @author guodingcheng
 * @date 2019/11/4 19:22
 **/
public class Request <T extends BusinessRequest> {

    private Header head;

    private T data;

    public Header getHead() {
        return head;
    }

    public void setHead(Header head) {
        this.head = head;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.fangcang.hotel.sync.oyo.manager.impl;

import com.fangcang.hotel.sync.oyo.api.request.directHotel.GetHotelInfosRequest;
import com.fangcang.hotel.sync.oyo.api.request.directHotel.GetRoomInfosRequest;
import com.fangcang.hotel.sync.oyo.api.request.directOrder.CancelOrQueryOrderRequest;
import com.fangcang.hotel.sync.oyo.api.request.directOrder.CreateOrderRequest;
import com.fangcang.hotel.sync.oyo.api.request.directOrder.ValidateOrderRequest;
import com.fangcang.hotel.sync.oyo.api.request.directProduct.GetProductInfosRequest;
import com.fangcang.hotel.sync.oyo.api.request.directProduct.GetRatePlanInfosRequest;
import com.fangcang.hotel.sync.oyo.api.response.Response;
import com.fangcang.hotel.sync.oyo.api.response.directHotel.GetHotelInfosResponse;
import com.fangcang.hotel.sync.oyo.api.response.directHotel.GetRoomInfosResponse;
import com.fangcang.hotel.sync.oyo.api.response.directOrder.CancelOrderResponse;
import com.fangcang.hotel.sync.oyo.api.response.directOrder.CreateOrderResponse;
import com.fangcang.hotel.sync.oyo.api.response.directOrder.QueryOrderResponse;
import com.fangcang.hotel.sync.oyo.api.response.directOrder.ValidateOrderResponse;
import com.fangcang.hotel.sync.oyo.api.response.directProduct.GetProductInfosResponse;
import com.fangcang.hotel.sync.oyo.api.response.directProduct.GetRatePlanInfosResponse;
import com.fangcang.hotel.sync.oyo.manager.OYOMapper;
import org.springframework.stereotype.Service;

/**
 * @author py
 * @date 2019/11/4 17:48
 **/
@Service("OYOMapper")
public class OYOMapperImpl implements OYOMapper {

    /**
     * 酒店信息查询
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<GetHotelInfosResponse> getHotelInfos(GetHotelInfosRequest request) throws Exception {
        return null;
    }

    /**
     * 房型信息查询
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<GetRoomInfosResponse> getRoomInfos(GetRoomInfosRequest request) throws Exception {
        return null;
    }

    /**
     * 价格计划查询
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<GetRatePlanInfosResponse> getRatePlanInfos(GetRatePlanInfosRequest request) throws Exception {
        return null;
    }

    /**
     * 商品查询
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<GetProductInfosResponse> getProductInfos(GetProductInfosRequest request) throws Exception {
        return null;
    }

    /**
     * 预下单校验
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<ValidateOrderResponse> validateOrder(ValidateOrderRequest request) throws Exception {
        return null;
    }

    /**
     * 创建订单
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<CreateOrderResponse> createOrder(CreateOrderRequest request) throws Exception {
        return null;
    }

    /**
     * 取消订单
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<CancelOrderResponse> cancelOrder(CancelOrQueryOrderRequest request) throws Exception {
        return null;
    }

    /**
     * 查询订单
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public Response<QueryOrderResponse> queryOrder(CancelOrQueryOrderRequest request) throws Exception {
        return null;
    }
}

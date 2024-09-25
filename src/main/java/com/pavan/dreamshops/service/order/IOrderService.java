package com.pavan.dreamshops.service.order;

import com.pavan.dreamshops.dto.OrderDto;
import com.pavan.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}

package ir.alirezavalipour.clouddemo.order.service;

import ir.alirezavalipour.clouddemo.order.dto.OrderRequestDTO;
import ir.alirezavalipour.clouddemo.order.entity.Order;

public interface OrderServiceInterface {


    Order createOrder(OrderRequestDTO requestDTO);

}

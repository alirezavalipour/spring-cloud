package ir.alirezavalipour.clouddemo.order.controller;

import ir.alirezavalipour.clouddemo.order.dto.OrderRequestDTO;
import ir.alirezavalipour.clouddemo.order.dto.OrderResponseDTO;
import ir.alirezavalipour.clouddemo.order.entity.Order;
import ir.alirezavalipour.clouddemo.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Order createOrder(@RequestBody OrderRequestDTO requestDTO){
        return this.service.createOrder(requestDTO);
    }

    @GetMapping("/all")
    public List<OrderResponseDTO> getOrders(){
        return this.service.getAll();
    }


}

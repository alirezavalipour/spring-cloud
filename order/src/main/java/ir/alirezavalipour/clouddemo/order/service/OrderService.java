package ir.alirezavalipour.clouddemo.order.service;

import ir.alirezavalipour.clouddemo.order.dto.OrderRequestDTO;
import ir.alirezavalipour.clouddemo.order.dto.OrderResponseDTO;
import ir.alirezavalipour.clouddemo.order.entity.Order;
import ir.alirezavalipour.clouddemo.order.enums.OrderStatus;
import ir.alirezavalipour.clouddemo.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService implements OrderServiceInterface {

    private final OrderRepository orderRepository;

    public Order createOrder(OrderRequestDTO requestDTO) {
        Order order = this.dtoToEntity(requestDTO);
        orderRepository.save(order);
        return order;
    }

    private Order dtoToEntity(final OrderRequestDTO dto) {
        Order order = new Order();
        order.setUserId(1L);
        order.setStatus(OrderStatus.CREATED);
        order.setToAmount(dto.getToAmount());
        order.setFromAmount(dto.getFromAmount());
        order.setToCurrency(dto.getToCurrency());
        order.setFromCurrency(dto.getFromCurrency());
        return order;
    }

    @Transactional(readOnly = true)
    public List<OrderResponseDTO> getAll() {
        List<Order> orders = orderRepository.findAllByUserId(1L);
        return orders.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    private OrderResponseDTO entityToDTO(Order order) {
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setUserId(1L);
        orderResponseDTO.setStatus(order.getStatus());
        orderResponseDTO.setFromAmount(order.getFromAmount());
        orderResponseDTO.setToAmount(order.getToAmount());
        orderResponseDTO.setFromCurrency(order.getFromCurrency());
        orderResponseDTO.setToCurrency(order.getToCurrency());
        return orderResponseDTO;
    }


}


package ir.alirezavalipour.clouddemo.order.dto;

import ir.alirezavalipour.clouddemo.order.enums.CurrencyEnum;
import ir.alirezavalipour.clouddemo.order.enums.OrderStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponseDTO {

    private BigDecimal fromAmount;
    private BigDecimal toAmount;
    private CurrencyEnum fromCurrency;
    private CurrencyEnum toCurrency;
    private OrderStatus status;
    private String trackingCode;
    private Long userId;

}

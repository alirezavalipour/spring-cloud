package ir.alirezavalipour.clouddemo.order.dto;

import ir.alirezavalipour.clouddemo.order.enums.CurrencyEnum;
import ir.alirezavalipour.clouddemo.order.enums.OrderType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderRequestDTO {

    private BigDecimal fromAmount;
    private BigDecimal toAmount;
    private CurrencyEnum fromCurrency;
    private CurrencyEnum toCurrency;
    private String trackingCode;
    private Long userId;
    private OrderType orderType;

}

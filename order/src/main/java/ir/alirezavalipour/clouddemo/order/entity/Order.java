package ir.alirezavalipour.clouddemo.order.entity;

import ir.alirezavalipour.clouddemo.order.enums.CurrencyEnum;
import ir.alirezavalipour.clouddemo.order.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "orders", uniqueConstraints = {@UniqueConstraint(columnNames = "trackingCode")})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(columnDefinition = "NUMERIC")
    private BigDecimal fromAmount;
    @Column(columnDefinition = "NUMERIC")
    private BigDecimal toAmount;
    private CurrencyEnum fromCurrency;
    private CurrencyEnum toCurrency;
    private OrderStatus status;
    private String trackingCode = UUID.randomUUID().toString();
    private Long userId;


}

package org.example.orderservice.dto;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private Long id;

    private String customerName;

    private BigDecimal totalAmount;

    private String status;
}

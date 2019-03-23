package com.lml.boot.rocketmq.sb;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderPaidEvent implements Serializable {
    private String orderId;
    private BigDecimal bigDecimal;
}

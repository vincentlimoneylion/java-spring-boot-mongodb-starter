package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanInfoProductConfiguration {
    private BigDecimal deferralFee;
    private BigDecimal lateFee;
    private Integer lateFeeGracePeriod;
}

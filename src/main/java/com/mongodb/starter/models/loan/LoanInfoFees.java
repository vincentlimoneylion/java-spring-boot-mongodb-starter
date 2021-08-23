package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class LoanInfoFees {
    private List<LoanInfoFee> fees = new ArrayList<>();

    // totalAmount = totalCollected + totalOutstanding
    private BigDecimal totalAmount;
    private BigDecimal totalCollected;
    private BigDecimal totalOutstanding;
}

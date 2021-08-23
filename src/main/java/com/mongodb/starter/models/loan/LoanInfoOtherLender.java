package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanInfoOtherLender {
    private String name;
    private String result;
    private String redirectURL;
    private String failedReason;
    private BigDecimal price; // price of lead that we sold to other lender
    private long responseTime;
    private String req;
    private String resp;
}

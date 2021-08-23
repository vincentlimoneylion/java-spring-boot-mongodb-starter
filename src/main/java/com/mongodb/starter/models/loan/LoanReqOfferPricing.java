package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanReqOfferPricing {
    private Double apr;
    private Integer minApprovedAmt;
    private Integer maxApprovedAmt;
}

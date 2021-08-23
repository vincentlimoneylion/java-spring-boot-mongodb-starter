package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanInfoPricingOffer {
    private Double minAmount;
    private Double maxAmount;
    private Double apr;
    private Double term;
    private Double originationRate;
}

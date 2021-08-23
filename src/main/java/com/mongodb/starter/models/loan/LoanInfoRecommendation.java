package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanInfoRecommendation {
    private LoanInfoRecommendationBv bv = new LoanInfoRecommendationBv();
}

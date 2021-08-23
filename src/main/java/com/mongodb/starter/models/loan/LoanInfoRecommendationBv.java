package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoanInfoRecommendationBv {
    private String result;
    private String bvRejectionCode;
    private List<AdverseAction> adverseActions = new ArrayList<>();
}

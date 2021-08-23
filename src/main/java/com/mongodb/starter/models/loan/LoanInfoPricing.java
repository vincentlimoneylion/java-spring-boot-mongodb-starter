package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class LoanInfoPricing {
    private boolean isActiveMlPlus;
    private boolean febLicense;
    private boolean counterOffer;
    private String fmSpecialOffer;
    private String bcSpecialOffer;
    private Map<String, Object> tags = new LinkedHashMap<>();
    private LoanInfoPricingSource source = new LoanInfoPricingSource();
    private LoanInfoPricingOffer offer = new LoanInfoPricingOffer();
}

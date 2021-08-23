package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class LoanInfoPricingSource {
    private ValueType incomeSource;
    private Map<ValueType, Double> values = new LinkedHashMap<>();
}

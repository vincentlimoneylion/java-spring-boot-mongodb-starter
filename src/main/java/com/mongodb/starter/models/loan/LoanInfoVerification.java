package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoanInfoVerification {
    private String purpose;
    private List<LoanInfoVerificationRequirement> requirements = new ArrayList<>();
    private List<String> reasons = new ArrayList<>();
}

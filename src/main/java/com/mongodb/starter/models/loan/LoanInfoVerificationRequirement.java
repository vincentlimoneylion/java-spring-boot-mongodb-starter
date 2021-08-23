package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanInfoVerificationRequirement {
    private String description;
    private Boolean redFlag;
    private boolean required;
}

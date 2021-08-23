package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanInfoOrganicState {
    private Boolean tcpaChecked;
    private Boolean privacyChecked;
    private BigDecimal highestPcd4AccountEstMonthlyIncome;
}

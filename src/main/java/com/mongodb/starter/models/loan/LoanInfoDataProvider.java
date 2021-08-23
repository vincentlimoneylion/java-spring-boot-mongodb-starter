package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanInfoDataProvider {
    private LoanInfoDataProviderReport reports = new LoanInfoDataProviderReport();
}

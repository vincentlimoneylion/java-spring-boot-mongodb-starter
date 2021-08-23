package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoanInfoDataProviderReport {
    private List<LoanInfoDataXReport> datax = new ArrayList<>();
}

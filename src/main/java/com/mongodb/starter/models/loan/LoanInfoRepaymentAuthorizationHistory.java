package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoRepaymentAuthorizationHistory {
    Boolean isAutomaticPayment;
    Date date;
}

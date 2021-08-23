package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanProcessBankAccount {
    private String routingNumber;
    private String accountNumber;
}

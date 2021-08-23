package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoQueue {
    private String loanQueue;
    private int renewalExtensions;
    private Date effectiveOn;
    private Date endedOn;
}

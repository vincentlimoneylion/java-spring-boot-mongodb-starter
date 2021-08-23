package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanInfoStatus {
    // all portfolios
    private String loanStatus;
    private String remarks;
    private int renewalExtensions;
    private Date createdOn = new Date();
    private Date effectiveOn = new Date();
    private Date endedOn;

    // rc
    private String loanId;
    private String displayNumber;
    private String currentHistoryId;
    private String originalLoanId;
    private String parentLoanId;
    private BigDecimal approvedAmount;
    private BigDecimal approvedFinanceFee;
    private BigDecimal annualPercentRate;
    private Date originationDate;
    private Date effectiveDate;
    private Date followUpDate;
    private Date dueDate;
    private Date paidOffDate;
    private Date brokenPromiseDate;
    private Date collectionStartDate;
}

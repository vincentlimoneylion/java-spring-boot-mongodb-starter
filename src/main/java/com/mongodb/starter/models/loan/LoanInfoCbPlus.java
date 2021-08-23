package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanInfoCbPlus {
    private String doneBvUnderwritingId;
    private String riskDecisionGrade;
    private String riskDecisionSnapshotId;
    private BigDecimal disbursementAmt;
    private BigDecimal escrowDisbursementAmt;
    private Boolean returningPlusCustomer;
    private Boolean returningCbPlusCustomer;
}

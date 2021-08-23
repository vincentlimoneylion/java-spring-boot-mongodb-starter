package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanInfoQds {
    private String csrOrigination; // CSR email who handles origination process
    private String csrRetention; // CSR email who handles collection process
    private String csrOriginatedBy; // CSR email who originate the loan
    private String csrApprovedBy; // CSR email who approve the loan
    private String csrWithdrawnBy;
    private String csrUnWithdrawnBy;
    private Date followUpDate;
    private String csrExpressedBy;
    private Date csrOriginationAssignedDate;
    private Date csrRetentionAssignedDate;
    private Boolean isUnderManualReview;
    private Boolean isExpedited;
    private Integer expeditedCase;
    private Date toBeExpiredDate;
    private Date lastReturnedDate;
    private String lastReturnCode;
    private Date inCollectionDate;
    private BigDecimal payoffAmount;
    private BigDecimal payoffPrincipal;
    private BigDecimal payoffInterest;
    private BigDecimal payoffNsfFee;
    private BigDecimal payoffLateFee;
    private Date missedPaymentEmailDate; // First email sent for missed payment reminder
    private Date collectionBatchGeneratedDate;
    private String collectAgencyName;
    private String collectAgencyPhone;
}

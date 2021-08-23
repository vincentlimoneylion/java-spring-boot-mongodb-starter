package com.mongodb.starter.models.loan;

import lombok.*;

import java.math.BigDecimal;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanInfoRepayment {
    private Date dateFirstPayment;
    private Date dateLastPayment;
    private Integer numPaymentLeft;

    private BigDecimal processingFee;
    private Integer daysToFirstPayment;
    private BigDecimal apr;
    private BigDecimal interestRate;
    private BigDecimal aprRate;             // to be deprecated and replaced by field "apr"
    private BigDecimal totalPayment;
    private BigDecimal totalFinanceCharge;
    private BigDecimal lenderInterestRate;  // e.g 24.9% for OH, 9.9% for TX
    private BigDecimal lenderInterestFee;

    private BigDecimal disbursementFee;
    private BigDecimal originationFee; //to be renamed to lenderOriginationFee
    private BigDecimal originationRate; //to be renamed to lenderOriginationRate
    private BigDecimal varOriginationRate;
    private BigDecimal csoOriginationRate;
    private BigDecimal csoOriginationFee;
    private BigDecimal csoFeeTotal;
    private BigDecimal csoFeeInstallment;
    private BigDecimal lateFee;
    private BigDecimal nsfFee;

    private BigDecimal preBvApprovedAmount;
    private BigDecimal postBvApprovedAmount;

    private BigDecimal minApprovedAmount;
    private BigDecimal approvedAmount;
    private BigDecimal maxApprovedAmount;
    private BigDecimal depositAmount;
    private BigDecimal indebtedAmount;
    private Integer loanLength;             // by month
    private BigDecimal originalInstallmentAmount;
    private BigDecimal monthlyInstallment;
    private BigDecimal buybackAdjustments;

    // Fields excusively for LionSign document
    private BigDecimal amountFinanced;
    private BigDecimal prepaidFinanceCharge;
    private BigDecimal esignAmountFinanced; // to be removed, for esign doc
    private BigDecimal esignPrepaidFinanceCharge; // to be removed, for esign doc
    private Boolean autoAch;
    private Boolean isLoanOwnerCompensated;

    private List<LoanInfoRepaymentHistory> originationHistories = new ArrayList<>();
    private List<LoanInfoRepaymentEscrowHistory> escrowHistories = new ArrayList<>();
    private List<LoanInfoRepaymentHistory> histories = new ArrayList<>();
    private List<LoanInfoRepaymentSchedule> schedules = new ArrayList<>();

    private List<String> paymentStatuses = new ArrayList<>();

    private String paymentProfile;    // Push to Debit, DDA, ACH
    private String paymentProfileId;

    private BigDecimal tipAmount;

    // Days Past Due
    private Date repaymentDpdDate;

    // Payment modification
    private boolean paymentModified;

    // added for Overtime loans
    private List<LoanInfoRepaymentAuthorizationHistory> authorizationHistories = new ArrayList<>();
}

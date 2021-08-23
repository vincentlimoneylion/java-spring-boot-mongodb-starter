package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoBv {
    private String clientId;
    private String accountId;
    private String provider;
    private String institutionId;
    private String institutionName;
    private String linkSource;
    private String payFrequency;
    private String routingNumber;
    private String accountNumber;

    private Integer numNsfFee10days;
    private Integer numNsfFee30days;
    private Integer numNsfFee60days;
    private Integer numOverdraftFee10days;
    private Integer numOverdraftFee30days;
    private Integer numOverdraftFee60days;
    private Integer paychecksSize;

    private Double avgBalBeforePaycheck;
    private Double avgBalAfterPaycheck;
    private Double bvIndex3;
    private Double bvIndex4;
    private Double acctBalance;
    private Double monthlyRepayment;
    private Double accountStabilityIndex25;
    private Double financialIndex25;
    private Double personalIndex25;
    private Double bv2Index25;
    private Double verifiedIncome;
    private Double estimatedMonthlyIncome3;
    private Integer numIncomeSources3;
    private Integer numActiveIncomeSources3;
    private Integer numIncomeSources4;
    private Integer numActiveIncomeSources4;
    private Double estimatedMonthlyIncome4;
    private Date lastPaycheckDate;

    private String predictedPayFrequency;
    private Date predictedLastPayDate;
    private Date predictedNextPayDate;
    private Date predictedSecondNextPayDate;

    private Float subPop9Threshold;
    private Float accountBalanceThreshold;
    private Integer totalIncomingFp31Loans;
    private Integer totalIncomingFp31LoansRepayment;
    private Integer totalIncomingFp31LoansDefaults;
}

package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoScore {
    private Double fpScorev3;
    private Double fpScorev3Threshold;
    private Double lbmScore;
    private Double lbmScoreThreshold;
    private Double lpScore;
    private Double lpScoreThreshold;
    private Double fpScore;
    private Double fpScorev2;
    private Double clvScorev1;
    private Double lcScore;
    private Double cbbInternalModelScore;
    private Double cbbH2oInternalModelScore;
    private Double cbbSupportModelScore;
    private Double cbbGlmScore;
    private Double cbbGlmScore2;
    private Double cbbEsbScore;
    private Double cbbMl1Score;
    private Double priceRejectWouldPayPrice;
    private Double priceRejectEsignScore;
    private Double priceRejectPresentScore;
    private Double tuLl1Score;
    private Double npgsTuLl1Score;
    private Double npgsCbbCfScore;
    private Double gkPercentileScore;
    private Double gkRawScore;
    private Double accountStabilityIndex25;
    private Double financialIndex25;
    private Double personalIndex25;
    private Double bv2Index25;

    //Not in use
    private Double lcScoreVersion;
    private Double fpScoreVersion;
    private Double lbmScorev2;
    private Double lbmScorev2FPD;
    private Double lbmScorev2ABN;
    private Double lbmScoreVersion;

    // external
    private Double clarityFraudScore;
    private Double clarityblVantageScore;
    private Double clarityblScoreX;
    private Double clarityblFico;
    private Double clarityBankBehavior2Score;
    private Double dataxDebitScore;
    private Double ebureauScore;
    private Double lexisRiskviewScore;
    private Double lexisRiskviewIncome;
    private Double lexisInstantIdScore;
    private Double transUnionIncomeEstimate;
    private Double transUnionIncomeLowEstimate;
    private Double transUnionIncomeHighEstimate;
    private Double transUnionMonthlyDebtObligation;
    private Double transUnionDerivedDti;
    private Double transUnionFico9;
    private Double transUnionNewAccountScore;
    private Double transUnionCvPersonalLoanRisk;
    private Double transUnionNumCounselingTrades;
    private Double transUnionTotalBalanceCounselingTrades;

    private Double riskScoreV1Result;
    private Double riskScoreV1ScoreCard;
    private Double factorTrustScore;

    private Double transUnionDebt1;
    private Double transUnionDebt2;
    private Double transUnionDebt3;
    private Double transUnionDti1;
    private Double transUnionDti2;
    private Double transUnionDti3;
    private Double transUnionDti4;
    private Double transUnionBalanceMortgage;
    private Double transUnionPercentageOpenCreditCardTrade;
    private Double transUnionPercentageOpenInstallmentTrade;
    private Integer transUnionNumberDedupedInquiry;
    private Integer transUnionNumberInstallmentLoans;

    private String ivIncomeReasonablenessResult;
    private String ivIncomeSource;

    private String ivTalxResult;

    private String bvIncomeResult;
    private Double bvIncome1;
    private Double bvIncome2;

    private Integer gVerifyAccountAgeInDays;

    private Double adpSalaryVerified;

    //TODO we will move all BV related details to loanapp.info.bv
    private Double bvDerivedDti;
    private Double bvVerifiedIncome;
    private String bvPayFreq;
    private Date bvLastPayDate;
    private Date bvNextPayDate;
    private Date bvSecondPayDate;
}

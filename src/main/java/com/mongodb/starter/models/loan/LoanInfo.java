package com.mongodb.starter.models.loan;

import lombok.*;

import java.math.BigDecimal;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanInfo {
    private String displayNumber;
    private String loanId;
    private String loanType;
    private String loanCategory;
    private String riskType;
    private String licensedState;
    private String lenderState;
    private Integer loanIndex;
    private String paymentStage; // origination, collection, settlement
    private String loanStatus;
    private String loanQueue;
    private String paidOffType;
    private Date effectiveDate; // is null when loan is rejected
    private String firstLoanStatus;
    private boolean isOriginated;
    private boolean isFebOriginated;
    private Date originatedDate;
    private boolean isApproved;
    private boolean isReFiEligible;
    private String refiLoanId;
    private Date approvedDate;
    private String owner;
    private String spv;
    private String subscriptionId;
    private String originationStatus;
    private String collectionStatus;
    private LoanInfoCollectionStatusMetadata collectionStatusMetadata = new LoanInfoCollectionStatusMetadata();
    private String leadIPAddr;
    private Integer previouslyAcceptedCost;
    private BigDecimal cpa;
    private BigDecimal cpaPlusUnderwriting;
    private Date acquiredDate;
    private Date originationAddedDate;  // date of origination status is updated
    private Date dateCoolOffPeriodEnd;
    private boolean isReturning;
    private String withdrawnReason;
    private Date withdrawnDate;
    private List<LoanInfoStatus> loanStatuses = new ArrayList<>();
    private List<LoanInfoQueue> loanQueues = new ArrayList<>();
    private List<LoanInfoOriginationStatus> originationStatuses = new ArrayList<>();
    private List<LoanInfoCollectionStatus> collectionStatuses = new ArrayList<>();
    private LoanInfoEsign esign = new LoanInfoEsign();
    private LoanInfoEpic epic = new LoanInfoEpic();
    private LoanInfoQds qds = new LoanInfoQds();
    private LoanInfoScore score = new LoanInfoScore();
    private LoanInfoBv bv = new LoanInfoBv();
    private LoanInfoMarketing marketing = new LoanInfoMarketing();
    private LoanInfoPricing pricing = new LoanInfoPricing();
    private LoanInfoRepayment repayment = new LoanInfoRepayment();
    private LoanInfoCollection collection;
    private LoanInfoFees loanFees;
    private List<LoanInfoUnderwriting> underwritings = new ArrayList<>();
    private List<LoanInfoOtherLender> otherLenders = new ArrayList<>();
    private List<String> manualReviewCheckList = new ArrayList<>();
    private LoanInfoRecommendation recommendation = new LoanInfoRecommendation();
    private List<LoanInfoQuestion> questions = new ArrayList<>();
    private List<LoanInfoHistory> histories = new ArrayList<>();
    private List<String> tags = new ArrayList<>();
    private List<LoanInfoFlag> flags = new ArrayList<>();
    private LoanInfoDataProvider dataprovider = new LoanInfoDataProvider();
    private Map<String, LoanScore> scores = new HashMap<>();
    private LoanInfoBuyBack buyBack = new LoanInfoBuyBack();
    private List<LoanInfoAdditionalInfo> additionalInfos = new ArrayList<>();
    private LoanInfoOrigin origin = new LoanInfoOrigin();
    private LoanInfoExperiment experiment = new LoanInfoExperiment();
    private LoanInfoThreatMetrix threatMetrix = new LoanInfoThreatMetrix();
    private LoanInfoVerifications verifications = new LoanInfoVerifications();
    boolean verificationRequired = false;
    private LoanInfoMlPlus mlPlus = new LoanInfoMlPlus();
    private LoanInfoCbPlus cbPlus = new LoanInfoCbPlus();
    private LoanInfoOrganicState organicState = new LoanInfoOrganicState();

    // to be removed
    private String portfolio;
    private String annualPercentageRate;
    private Double apr;
    private String approvedFinanceFee;

    // to be moved to info.score
    private double fpScore;
    private double fpScorev3;
    private double clvScorev1;
    private double fpScorev2;
    private double fpScoreVersion;
    private double lcScore;
    private double lcScoreVersion;
    private double lbmScore;
    private double lbmScorev2;
    private double lbmScorev2FPD;
    private double lbmScorev2ABN;
    private double lbmScoreVersion;
    private double lpScore;

    // to be moved to info.epic
    private String assignedLoanManager;
    private String assignedCollectionAgent;
    private Date applicationReceivedDate;
    private Date lastEpicDataUpdateDate;
    private String rejectedReason;
    private String epicClientId;
    private String currentHistory;
    private boolean isExpressLoan;
    private BigDecimal buyPrice;

    // to be moved to info.qds
    private boolean isUnderManualReview;
    private boolean isExpedited;
    private int expeditedCase;
    private Date addedToCollectionDate;
    private Date dateCollectionBatchGenerated;
    private String collectAgencyName;
    private String collectAgencyPhone;
    private String callAgencyName;

    // added for Overtime loans
    private LoanInfoProductConfiguration productConfiguration = new LoanInfoProductConfiguration();
}

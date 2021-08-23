package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Data
public class LoanResp {
    private String result;
    private Map<String, ResultReasonPair> results = new TreeMap<>();
    private String resultPostBV;
    private String oriRedirectUrl;
    private String redirectUrl;
    private String deniedPageRedirectUrl;
    private String internalRejectionReason;
    private List<LoanRespRejection> internalRejections = new ArrayList<>();
    private String internalRejectionReasonPostBV;
    private List<LoanRespRejection> internalRejectionsPostBV = new ArrayList<>();
    private Long responseTime;
    private Long duration;
    private List<AdverseAction> adverseActionCodes = new ArrayList<>();
    private List<AdverseAction> adverseActionCodesPostBV = new ArrayList<>();
    private List<AdverseAction> adverseActionCodesWithdrawn = new ArrayList<>();
    private List<KeyAdverseFactor> ficoKeyAdverseFactors = new ArrayList<>();
    private Boolean bvm;
    private Boolean isBought;
    private List<String> mandatoryFlags = new ArrayList<>();
    private LoanRespFebResults febResults = new LoanRespFebResults();
    private Boolean unableToDecide = false;
    private String unableToDecideReason;
}

package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ResultReasonPair {
    private String result;
    private Boolean isBought;
    private BigDecimal wouldPayPrice;
    private String internalRejectionReason;
    private List<LoanRespRejection> internalRejections = new ArrayList<>();
    private List<AdverseAction> adverseActionCodes = new ArrayList<>();
    private Date createdOn = new Date();
}

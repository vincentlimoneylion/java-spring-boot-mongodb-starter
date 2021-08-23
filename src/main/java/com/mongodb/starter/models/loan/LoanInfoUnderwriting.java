package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoUnderwriting {
    private String name; // [ "Clarity", "DataX", "Ebureau", "fpScore" ]
    private String callType; // PCFraud, Tradeline, Fraud, Bank, Multi
    private String ruleName; // Name of internal rule
    private Date dateUnderwriting;
    private String result;
    private String failReason;
    private String underwritingId; //com.moneylion.db.ml.model.underwritings.id
    private Double cost;
    private long duration;
    private String type; // [ "ondemand-csr", "ondemand-system", "waterfall" ]
    private String requestBy;
    private String transID;
    private String reqXml;
    private String respXml;
    private int loanInfoUnderwritingDataClassVersion; // default to be 1
}

package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanReqReferral {
    private String username;
    private String password;
    private String storekey;
    private String refurl;
    private String ipaddress;
    private String tierkey;
    private String affid;
    private String subid;
    private String leadsourcename;
    private String leadtype;
    private Double leadcost;
    private Double correlationInitialPrice;
    private String correlationLoanId;
    private boolean test;
    private String testtype;
}

package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanReqCustomerEmployment {
    private String incometype;
    private String paytype;
    private Integer empmonths;
    private Integer empyears;
    private String empname;
    private String empaddress;
    private String empaddress2;
    private String empcity;
    private String empstate;
    private String empzip;
    private String empphone;
    private String empphoneext;
    private String empfax;
    private String supervisorname;
    private String supervisorphone;
    private String supervisorphoneext;
    private Date hiredate;
    private String emptype;
    private String jobtitle;
    private String workshift;
    private Integer netmonthly;
    private Integer nlnetmonthly;
    private Integer bvnetmonthly;
    private Integer grossmonthly;
    private String payfrequency;
    private Date lastpaydate;
    private Date nextpaydate;
    private Date secondpaydate;
    @Deprecated private Date lastpaydatefixed;
    @Deprecated private Date nextpaydatefixed;
    @Deprecated private Date secondpaydatefixed;
    private LoanReqCustomerEmploymentPayroll payroll = new LoanReqCustomerEmploymentPayroll();
}

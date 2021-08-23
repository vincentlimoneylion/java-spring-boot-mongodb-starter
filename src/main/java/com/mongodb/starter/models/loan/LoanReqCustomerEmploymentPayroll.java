package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class LoanReqCustomerEmploymentPayroll {
    private String frequency;
    private Date lastPayDate;
    private Date nextPayDate;
    private Date secondPayDate;
    private Map<String, Object> details = new LinkedHashMap<>();
}

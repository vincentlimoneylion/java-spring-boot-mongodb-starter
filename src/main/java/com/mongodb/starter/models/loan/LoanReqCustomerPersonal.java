package com.mongodb.starter.models.loan;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanReqCustomerPersonal {
    private Integer requestedamount;
    private BigDecimal orirequestedamount;
    private String ssn;
    private Date dob;
    private String gender;
    private String firstname;
    private String middleinitial;
    private String lastname;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String homephone; // no "+1" prefix for Overtime loans; is prefixed with "+1" for the rest
    private String otherphone; // no "+1" prefix for Overtime loans; is prefixed with "+1" for the rest
    private String dlstate;
    private String dlnumber;
    private String contacttime;
    private Integer addressmonths;
    private Integer addressyears;
    private String rentorown;
    private Integer monthlyRental;
    private Integer monthlyMortgage;
    private boolean ismilitary;
    private boolean iscitizen;
    private boolean otheroffers;
    private String email;
    private String language;
    private String purpose;
}

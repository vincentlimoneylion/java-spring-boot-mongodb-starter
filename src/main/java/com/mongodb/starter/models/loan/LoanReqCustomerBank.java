package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanReqCustomerBank {
    private String accountholder;
    private String bankname;
    private String bankphone;
    private String accounttype;
    private String routingnumber;
    private String accountnumber; // account number last four for Overtime loans; full number for the rest
    private Integer bankmonths;
    private Integer bankyears;
    private Integer outstandingamt;
    private String activechecking;
    private String instId;
    private String cardPaymentProfileId; // for same day funding (link to user.paymentprofiles.id)
    private Integer badUpdateAttempts;
}

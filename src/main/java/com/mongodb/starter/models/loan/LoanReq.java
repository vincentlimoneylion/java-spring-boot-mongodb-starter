package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LoanReq {
    private LoanReqReferral referral = new LoanReqReferral();
    private LoanReqCustomer customer = new LoanReqCustomer();
    private List<LoanReqOffer> offers = new ArrayList<>();
}

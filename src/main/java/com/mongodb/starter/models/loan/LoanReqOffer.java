package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanReqOffer {
    private String type;
    private String code;
    private LoanReqOfferPricing pricing = new LoanReqOfferPricing();
}

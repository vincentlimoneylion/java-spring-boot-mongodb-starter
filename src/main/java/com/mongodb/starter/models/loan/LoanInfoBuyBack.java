package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanInfoBuyBack {
    private boolean buyBack;
    private boolean csoBuyBack;
    private Date buyBackDate;
    private double buyBackOutstandingPrincipal;
}

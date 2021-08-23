package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class LoanInfoEsign {
    private boolean isEsigned;
    private boolean isAgreed;
    private Date esignedDate;
    private String channel;
    private Integer minutesToSign;
    private boolean voided;
    private String signerIPAddr;
    private boolean eSignedWithin20Mins;
    private List<LoanInfoEsignDocument> esignDocuments = new ArrayList<>();
    private List<LoanInfoEsignDocument> esignHistoryDocuments = new ArrayList<>();
}

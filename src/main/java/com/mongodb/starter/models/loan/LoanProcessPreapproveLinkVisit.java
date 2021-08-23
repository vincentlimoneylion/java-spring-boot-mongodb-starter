package com.mongodb.starter.models.loan;

import lombok.Data;

import java.util.Date;

@Data
public class LoanProcessPreapproveLinkVisit {
    private String preapproveCode;
    private Date dateVisited;
    private boolean isBrowserNotSupported;
    private String ipAddress;
    private String deviceID;
    private String userAgent;
    private String referer;
    private String deviceType;
}

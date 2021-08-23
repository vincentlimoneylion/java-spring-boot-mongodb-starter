package com.mongodb.starter.models.loan;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class LoanInfoDataXReport {
    private String type;
    private ObjectId reportedID;
    private String responseCode;
    private String responseMessage;
}

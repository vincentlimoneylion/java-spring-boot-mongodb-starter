package com.mongodb.starter.models.loan;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.Date;

@Data
public class LoanInfoEsignDocument {
    private ObjectId id;
    private boolean isEsigned;
    private String signerIPAddr;
    private String documentId;
    private String documentName;
    private String documentDisplayName;
    private String esignedDate;
    private Date esignDate;
    private Date createdOn = new Date();
    private Date updatedOn = new Date();
}

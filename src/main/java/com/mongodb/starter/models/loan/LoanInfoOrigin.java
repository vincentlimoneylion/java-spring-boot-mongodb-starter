package com.mongodb.starter.models.loan;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class LoanInfoOrigin {
    private ObjectId referenceId;
    private String reference;
}

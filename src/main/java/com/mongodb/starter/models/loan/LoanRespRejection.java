package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanRespRejection {
    private String type;
    private String reason;
    private String description;
}

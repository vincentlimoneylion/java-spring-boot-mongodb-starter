package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class AdverseAction {
    private Integer key;
    private String shortCode;
    private Double priority;
    private String externalDisplayString;
}

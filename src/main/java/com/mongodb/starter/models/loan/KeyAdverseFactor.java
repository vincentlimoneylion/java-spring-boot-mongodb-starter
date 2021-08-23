package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class KeyAdverseFactor {
    private Integer rank;
    private String code;
    private String externalDisplayString;
}

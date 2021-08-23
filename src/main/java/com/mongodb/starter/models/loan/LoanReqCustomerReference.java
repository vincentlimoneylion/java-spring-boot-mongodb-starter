package com.mongodb.starter.models.loan;

import lombok.Data;

@Data
public class LoanReqCustomerReference {
    private String firstname;
    private String lastname;
    private String phone;
    private String relationship;
}

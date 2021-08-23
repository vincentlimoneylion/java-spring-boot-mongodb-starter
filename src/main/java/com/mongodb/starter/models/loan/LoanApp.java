package com.mongodb.starter.models.loan;

import lombok.*;
import nonapi.io.github.classgraph.json.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "loanapp")
@Data
@NoArgsConstructor
@AllArgsConstructor
@With
public class LoanApp {
    @Id
    private ObjectId id = new ObjectId();
    private LoanReq req = new LoanReq();
    private LoanResp resp = new LoanResp();
    private LoanInfo info = new LoanInfo();
    private LoanProcess process = new LoanProcess();
    private Date createdOn = new Date();
    private Date updatedOn = new Date();
    private String source;
    private String clientId;
    private String portfolio;
    private String version;

    // added for Overtime loans
    private String userId;

    public String getLicensedStateForPayment() {
        return "FEB".equalsIgnoreCase(info.getLicensedState()) || "CRB".equalsIgnoreCase(info.getLicensedState()) ?
                req.getCustomer().getPersonal().getState() :
                info.getLicensedState();
    }
}

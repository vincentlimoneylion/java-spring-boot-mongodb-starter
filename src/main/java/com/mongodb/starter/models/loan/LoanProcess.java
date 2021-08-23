package com.mongodb.starter.models.loan;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class LoanProcess {
    private String preapproveCode;
    private String usedpreapprovedCode;
    private boolean isLinkedModified;
    private Date dateLinkOpened;
    private String browserAgentName;
    private Integer browserAgentVersion;
    private Date dateLinkVisited;
    private Date preapproveLinkVisitedDate;

    private boolean isScheduledWithCsr;
    private Date scheduledWithCsrDate;
    private String scheduledWithCsrDateStr;
    private int scheduledWithCsrTimeslot;
    private InternalUserName handledByCsrName;
    private Date dateLastSentEsignEmail;
    private List<EsignEmailSentLog> emailSentLogs = new ArrayList<>();
    private boolean toUpdateRepaymentInfo;
    private String preapproveScreenId;
    private String preapproveScreenIdHistory;
    private boolean isApprovedAmountRangeChanged;
    private String approvedAmountChangedType;
    private String referralUrl;
    private boolean isPaycheckAvailable;
    private boolean isBVOptional;
    private boolean isBVLoginAttempted;
    private Boolean isTncAgreed;
    private Boolean isReadyForPreapprove;
    private List<LoanProcessBankAccount> bankAccounts = new ArrayList<>();
    private List<LoanProcessBv> bvAttempts = new ArrayList<>();

    // not in used
    private List<LoanProcessPreapproveLinkVisit> preapproveLinkVisits = new ArrayList<>();

    /**
     * Only used by RDNT
     */
    private boolean isEsignedInd;
    private boolean isBV;
    private Date bvDate;

    public void setPreapproveScreenId(String preapproveScreenId) {
        this.preapproveScreenId = preapproveScreenId;

        if(!StringUtils.isEmpty(preapproveScreenId)){
            if (preapproveScreenIdHistory == null) {
                preapproveScreenIdHistory = preapproveScreenId;
            } else if (!preapproveScreenIdHistory.endsWith(preapproveScreenId)) {
                preapproveScreenIdHistory = preapproveScreenIdHistory.concat("," + preapproveScreenId);
            }
        }
    }
}

package com.kcbgroup.main.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


import java.time.format.DateTimeFormatter;
import java.util.Date;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountInfo {
    private Long accountNumber;
    private Long currentBalance;
    private Date dateOpened;
    private Integer daysInArrears;
    private String delinquencyCode;
    private boolean isYourAccount;
    private String lastPaymentAmount;
    private Date lastPaymentDate;
    private DateTimeFormatter loadedAt;
    private Long originalAmount;
    private Long overDueBalance;
    private Date overDueDate;
    private Integer productTypeId;
    private Long identityNumber;
}

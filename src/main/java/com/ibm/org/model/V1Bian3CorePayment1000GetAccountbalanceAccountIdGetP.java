package com.ibm.org.model;

import org.springframework.http.ResponseEntity;
import com.ibm.org.model.Account;

public class V1Bian3CorePayment1000GetAccountbalanceAccountIdGetP {

    private String accountId;

    public V1Bian3CorePayment1000GetAccountbalanceAccountIdGetP() {

    }

    public V1Bian3CorePayment1000GetAccountbalanceAccountIdGetP(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId () {
        return accountId;
    }

    public void setAccountId (String accountId) {
        this.accountId = accountId;
    }

}

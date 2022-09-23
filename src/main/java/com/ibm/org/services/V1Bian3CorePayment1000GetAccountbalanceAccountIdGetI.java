package com.ibm.org.services;

import com.ibm.org.model.V1Bian3CorePayment1000GetAccountbalanceAccountIdGetP;
import com.ibm.org.model.V1Bian3CorePayment1000GetAccountbalanceAccountIdGetResponseWrapper;

public interface V1Bian3CorePayment1000GetAccountbalanceAccountIdGetI {

    public V1Bian3CorePayment1000GetAccountbalanceAccountIdGetResponseWrapper execute(V1Bian3CorePayment1000GetAccountbalanceAccountIdGetP requestParams) throws Exception;

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}

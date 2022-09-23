package com.ibm.org.exception;

import java.util.HashMap;
import java.util.Map;

import com.ibm.org.exception.ApiExceptionResponse;
import com.ibm.org.exception.ErrorStatusCode;
import com.ibm.org.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Bad Request"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,Void.class,"Internal Server"));
		 responses.put(ErrorStatusCode.getStatusCode(503),ApiExceptionResponse.getInstance(503,Void.class,"Service Unavailable"));
		 
		 apiExceptions.put("v1Bian3CorePayment1000InitpaymentPost",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Bad Request"));
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,Void.class,"Internal Server"));
		 responses.put(ErrorStatusCode.getStatusCode(503),ApiExceptionResponse.getInstance(503,Void.class,"Service Unavailable"));
		 
		 apiExceptions.put("v1Bian3CorePayment1000UpdatepaymentPut",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}

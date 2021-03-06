package com.seniorsteps.app.response;

import com.seniorsteps.app.models.eums.ResponseCode;

public class ResponseError {

    private int status;
    private String message;
    
    public ResponseError(ResponseCode responseCode) {
    	
    	if(responseCode != null && responseCode != ResponseCode.SUCCESS) {
    		this.status = responseCode.getCode();
    		this.message = responseCode.getMessage();
    	}
    	
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
	
}

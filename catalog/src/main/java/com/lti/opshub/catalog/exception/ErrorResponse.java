package com.lti.opshub.catalog.exception;

import java.util.Date;

/**
 * This is error domain for error response.
 */
public class ErrorResponse {

  private String errorCode;
  private String message; 
  private String detailMessage;
  private Date timeStamp; 
  private String api;
  
  public String getErrorCode() {
      return errorCode;
  }
  public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
  }
  public String getMessage() {
      return message;
  }
  public void setMessage(String message) {
      this.message = message;
  }
  public String getDetailMessage() {
      return detailMessage;
  }
  public void setDetailMessage(String detailMessage) {
      this.detailMessage = detailMessage;
  }
  public String getApi() {
      return api;
  }
  public void setApi(String api) {
      this.api = api;
  }
  public Date getTimeStamp() {
      return timeStamp;
  }
  public void setTimeStamp(Date timeStamp) {
      this.timeStamp = timeStamp;
  } 
  
  public ErrorResponse(String errorCode, String message, String detailMessage, Date timeStamp,
      String api) {
    super();
    this.errorCode = errorCode;
    this.message = message;
    this.detailMessage = detailMessage;
    this.timeStamp = timeStamp;
    this.api = api;
  }
  
  
  public ErrorResponse() {
    super();
  }
  
  
  
  
 
  
  public String toString() {
      StringBuilder sbr = new StringBuilder("Error = { ");
      sbr.append("errorCode=").append(errorCode)
      .append(" message=").append(message)
      .append(" detailMessage=").append(detailMessage)
      .append(" api=").append(api)
      .append(" timeStamp=").append(timeStamp)
      .append("}");
      return sbr.toString();      
  }
}

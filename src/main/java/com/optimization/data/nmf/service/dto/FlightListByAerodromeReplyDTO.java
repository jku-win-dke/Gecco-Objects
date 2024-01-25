package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightListByAerodromeReplyDTO {
    @JacksonXmlProperty(localName = "requestReceptionTime")
    private LocalDateTimeToMinOrSecDTO requestReceptionTime;
    
    @JacksonXmlProperty(localName="requestId")
    private String requestId;
    
    @JacksonXmlProperty(localName = "sendTime")
    private LocalDateTimeToMinOrSecDTO sendTime;
    
    @JacksonXmlProperty(localName = "status")
    private String status;
    
    @JacksonXmlProperty(localName = "data")
    private DataDTO data;

    public LocalDateTimeToMinOrSecDTO getRequestReceptionTime() {
        return requestReceptionTime;
    }

	public void setRequestReceptionTime(LocalDateTimeToMinOrSecDTO requestReceptionTime) {
        this.requestReceptionTime = requestReceptionTime;
    }

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LocalDateTimeToMinOrSecDTO getSendTime() {
		return sendTime;
	}

	public void setSendTime(LocalDateTimeToMinOrSecDTO sendTime) {
		this.sendTime = sendTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    public DataDTO getData() {
		return data;
	}

	public void setData(DataDTO data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "FlightListByAerodromeReplyDTO ["
				+ (requestReceptionTime != null ? "requestReceptionTime=" + requestReceptionTime + ", " : "")
				+ (requestId != null ? "requestId=" + requestId + ", " : "")
				+ (sendTime != null ? "sendTime=" + sendTime + ", " : "")
				+ (status != null ? "status=" + status + ", " : "") + (data != null ? "data=" + data : "") + "]";
	}
}

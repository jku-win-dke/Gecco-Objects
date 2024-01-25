package com.optimization.objects.model.aus.ws;

import java.util.Date;

import com.optimization.data.controller.service.dto.OptimizationStateEnum;

public class WSHeartbeatResponse {
	private String requestId;
	private NotificationTypeEnum mutation = NotificationTypeEnum.HB_RESPONSE;
	private Date sendTime;
	private int connectionState;
	private OptimizationStateEnum optimizationState;
	
	public WSHeartbeatResponse() {
		
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public NotificationTypeEnum getMutation() {
		return mutation;
	}

	public void setMutation(NotificationTypeEnum mutation) {
		this.mutation = mutation;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public int getConnectionState() {
		return connectionState;
	}

	public void setConnectionState(int connectionState) {
		this.connectionState = connectionState;
	}

	public OptimizationStateEnum getOptimizationState() {
		return optimizationState;
	}

	public void setOptimizationState(OptimizationStateEnum optimizationState) {
		this.optimizationState = optimizationState;
	}
	
	
}

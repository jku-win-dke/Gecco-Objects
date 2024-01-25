package com.optimization.objects.model.aus.ws;

public class NewAcceptedSolutionsNotification {
	private NotificationTypeEnum mutation = NotificationTypeEnum.NEW_ACCEPTED_SOLUTION_AVAILABLE;
	private String optimizationSession = null;

	public NewAcceptedSolutionsNotification() {
		
	}
	
	public NewAcceptedSolutionsNotification(String optimizationSession) {
		this.optimizationSession = optimizationSession;
	}
	
	public NotificationTypeEnum getMutation() {
		return mutation;
	}

	public void setMutation(NotificationTypeEnum mutation) {
		this.mutation = mutation;
	}

	public String getOptimizationSession() {
		return optimizationSession;
	}

	public void setOptimizationSession(String optimizationSession) {
		this.optimizationSession = optimizationSession;
	}

	@Override
	public String toString() {
		return "NewAcceptedSolutionsNotification [" + (mutation != null ? "mutation=" + mutation + ", " : "")
				+ (optimizationSession != null ? "optimizationSession=" + optimizationSession : "") + "]";
	}
}

package com.optimization.objects.model.aus.ws;

public class NewProposedSolutionsNotification {
	private NotificationTypeEnum mutation = NotificationTypeEnum.NEW_PROPOSED_SOLUTIONS_AVAILABLE;
	private String optimizationSession = null;

	public NewProposedSolutionsNotification() {
		
	}
	
	public NotificationTypeEnum getMutation() {
		return mutation;
	}

	public void setMutation(NotificationTypeEnum mutation) {
		this.mutation = mutation;
	}
	
	public NewProposedSolutionsNotification(String optimizationSession) {
		this.optimizationSession = optimizationSession;
	}

	public String getOptimizationSession() {
		return optimizationSession;
	}

	public void setOptimizationSession(String optimizationSession) {
		this.optimizationSession = optimizationSession;
	}

	@Override
	public String toString() {
		return "NewProposedSolutionsNotification [" + (mutation != null ? "mutation=" + mutation + ", " : "")
				+ (optimizationSession != null ? "optimizationSession=" + optimizationSession : "") + "]";
	}
}

package com.optimization.objects.model.aus.ws;

public class NewRegulationNotification {
	private NotificationTypeEnum mutation = NotificationTypeEnum.NEW_REGULATION_AVAILABLE;
	private String airport = null;
	private String user = null;
	private String regulationId = null;
	
	public NewRegulationNotification() {
		
	}

	public NewRegulationNotification(String airport, String user, String regulationId) {
		super();
		this.airport = airport;
		this.user = user;
		this.regulationId = regulationId;
	}

	public NotificationTypeEnum getMutation() {
		return mutation;
	}

	public void setMutation(NotificationTypeEnum mutation) {
		this.mutation = mutation;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}

	@Override
	public String toString() {
		return "NewRegulationNotification [" + (mutation != null ? "mutation=" + mutation + ", " : "")
				+ (airport != null ? "airport=" + airport + ", " : "") + (user != null ? "user=" + user + ", " : "")
				+ (regulationId != null ? "regulationId=" + regulationId : "") + "]";
	}
}

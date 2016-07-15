package sunset.com.validation.routines;

public class HippoResponse {

	String result;
	String reason;
	boolean role;
	boolean free;
	boolean disposable;
	String email;
	String domain;
	String user;
	String mailServerLocation;
	int duration;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public boolean isDisposable() {
		return disposable;
	}
	public void setDisposable(boolean disposable) {
		this.disposable = disposable;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMailServerLocation() {
		return mailServerLocation;
	}
	public void setMailServerLocation(String mailServerLocation) {
		this.mailServerLocation = mailServerLocation;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "HippoResponse [result=" + result + ", reason=" + reason + ", role=" + role + ", free=" + free
				+ ", disposable=" + disposable + ", email=" + email + ", domain=" + domain + ", user=" + user
				+ ", mailServerLocation=" + mailServerLocation + ", duration=" + duration + "]";
	}
	
	
	
}

public class Schedule extends LimitedEvent {

	private User ower;

	private Collection<Week> weeks;

	public Date getStartTime() {
		return null;
	}

	public boolean setStartTime(Date date) {
		return false;
	}

	public Date getEndTime() {
		return null;
	}

	public boolean setEndTime(Date date) {
		return false;
	}

	public User getUser() {
		return null;
	}

	public boolean setUser(User user) {
		return false;
	}

	public boolean addWeek(Week week) {
		return false;
	}

	public boolean addWeeks(Collection<Week> weeks) {
		return false;
	}

}

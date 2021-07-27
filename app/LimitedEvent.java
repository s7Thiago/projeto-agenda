public abstract class LimitedEvent {

	private Date startTime;

	private Date endTime;

	private Priority priority;

	private int id;

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

	public abstract boolean notify();

	public Priority getPriority() {
		return null;
	}

	public boolean setPriority(Priority priority) {
		return false;
	}

	public int getId() {
		return 0;
	}

}

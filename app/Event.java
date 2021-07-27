public class Event extends LimitedEvent {

	private String title;

	private String description;

	private String location;

	public Date getStartTime() {
		return null;
	}

	public Date getEndTime() {
		return null;
	}

	public boolean setEndTime(Date date) {
		return false;
	}

	public boolean setStartTime(Date date) {
		return false;
	}

	public String getTitle() {
		return null;
	}

	public String getDescription() {
		return null;
	}

	public boolean setTitle(String title) {
		return false;
	}

	public boolean setDescription(String description) {
		return false;
	}

}

public class Day extends LimitedEvent {

	private Collection<Event> commitments;

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

	public Collection<Event> getCommitments() {
		return null;
	}

	public boolean addCommitment(Event event) {
		return false;
	}

	public boolean removeCommitment(int eventId) {
		return false;
	}

	@Override
	public boolean notify() {
		// TODO Auto-generated method stub
		return false;
	}

}

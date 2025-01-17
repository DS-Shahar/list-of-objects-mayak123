public class Task {
	private int  credit;
	private int priority;
	private String id;
	public String getId() {
		return id;
	}

	public int getPriority() {
		return priority;
	}

	public int getCredit() {
		return credit;
	}

	public Task(String id, int priority, int credit) {
		super();
		this.id = id;
		this.priority = priority;
		this.credit = credit;
	}

	public void decPriority() {
		priority++;
	}

	public void addCredit(int c) {
		credit += c;
	}

	public void subCredit(int c) {
		credit -= c;
	}

	public String toString() {
		return "Task [id=" + id + ", priority=" + priority + ", credit=" + credit + "]";
	}
	
}






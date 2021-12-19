

import java.util.List;

public class SprintBackLog extends BackLog {
	
	private int numberOfSprint;

	public SprintBackLog(int numberOfSprint, List<UserStory> userStories) {
		super(userStories);
		this.numberOfSprint = numberOfSprint;
	}

	@Override
	public String toString() {
		return "Sprint numero : " + this.numberOfSprint + '\n' + super.toString();
	}
}

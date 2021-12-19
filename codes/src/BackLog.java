

import java.util.ArrayList;
import java.util.List;

public abstract class BackLog {
	
	private List<UserStory> userStories;
	
	public BackLog() {
		this.userStories = new ArrayList<UserStory>();
	}
	
	protected BackLog(List<UserStory> userStories) {
		this.userStories = userStories;
	}
	
	protected List<UserStory> getUserStories() {
		return this.userStories;
	}

	public void add(UserStory userStory) {
		this.userStories.add(userStory);
	}
	
	public void remove(UserStory userStory) {
		this.userStories.remove(userStory);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (UserStory userStory : this.userStories) {
			sb.append(userStory.toString());
			sb.append('\n');
		}
		return sb.toString();
	}
	
	
}

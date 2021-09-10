package hashset;

import java.util.Objects;

public class History {
	private String time;
	private String story;
	
	public void setTime(String time) {
		this.time=time;
	}
	public String getTime() {
		return time;
	}
	public void setStory(String story) {
		this.story=story;
	}
	public String getStory() {
		return story;
	}
	@Override
	public int hashCode() {
		return Objects.hash(story, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		History other = (History) obj;
		return Objects.equals(story, other.story) && Objects.equals(time, other.time);
	}
	
}

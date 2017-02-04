import java.util.*;


public class Task implements Priority, Named {
	public int priority;
	public String name;
	public boolean completed;
	public final void setPriority(int desireToComplete){
		priority = desireToComplete;
	}
	public final int getPriority(){
		return priority;
	}
	
	public Task(){
		completed = false;
	}

	public Task(String taskName, int need, boolean done){
		name = taskName;
		priority = need;
		completed = done;
	}

	public final void setName(String newName){
		name = newName;
	}

	public final String getName(){
		return name;
	}
};

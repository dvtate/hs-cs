import java.util.*;

// something we need to do
public class Task implements Priority {
	public int priority;		// how important it is
	public String name;			// what is it?
	public boolean completed;	// are we done yet

	// constructors
	public Task(){
		completed = false;
	}
	public Task(String taskName, int need, boolean done){
		name = taskName;
		priority = need;
		completed = done;
	}
	public Task(String taskName, int need){
		name = taskName;
		priority = need;
		completed = false;
	}


	// these aren't really needed but I did them anyway :P

	public final void setPriority(int desireToComplete){
		priority = desireToComplete;
	}
	public final int getPriority(){
		return priority;
	}
	
	public final void setName(String newName){
		name = newName;
	}
	public final String getName(){
		return name;
	}

	public final void setCompleted(boolean done){
		completed = done;
	}
	public final void finish(){
		completed = true;
	}
	public final boolean isCompleted(){
		return completed;
	}
		
};

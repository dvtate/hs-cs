import java.util.*;

public class Ch5Proj01 {

	private static int getMaxPriority(final Task[] taskList){
		int ret = 0, maxVal = taskList[0].getPriority();
	
		for (int i = 0; i < taskList.length; i++)
			if (!taskList[i].completed && taskList[i].getPriority() > maxVal) {
				ret = i;
				maxVal = taskList[i].getPriority();
			}

		return ret;
	}

	public static void main(String[] args){

		System.out.println("enter the tasks to sort.");
		System.out.println("separate the task names and priorities with a colon");
		System.out.println("separate the tasks with spaces (ie- \"taskA:32 taskB:45 ...\")");
		System.out.println("press [enter] when you're done");
		Scanner stdin = new Scanner(System.in);
		
		String[] todoText = stdin.nextLine().split(" ");

		// make an array of Tasks
		Task[] todoList = new Task[todoText.length];
		for (int i=0; i < todoList.length; i++)
		   todoList[i] = new Task();

		for (int i = 0; i < todoList.length; i++) {
			String[] nameValuePair = todoText[i].split(":");
			try {
				todoList[i].setName(nameValuePair[0]);
				todoList[i].setPriority(Integer.parseInt(nameValuePair[1]));
			} catch (NumberFormatException e) {
				System.out.println("Invalid number " + nameValuePair[1]);
				System.out.println("Try again.\n");
				main(args);
				return;
			}
		}


				

		for (int taskNumber = 0; taskNumber < todoList.length; taskNumber++) {
			Task mostImportant = todoList[getMaxPriority(todoList)];
			mostImportant.completed = true;
	
			System.out.println(taskNumber + 1 + " : " + mostImportant.getName() + ":" + mostImportant.getPriority());

			
			
			


		}
	}



};

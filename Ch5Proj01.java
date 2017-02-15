import java.util.*;


// input given tasks and their priority and sort them by importance

public class Ch5Proj01 {

	// sorting algorithm
	private static Task[] selectionSortTasks(Task[] arr){

		for (int i = 0; i < arr.length - 1; i++) {
		    int index = i;
		    for (int j = i + 1; j < arr.length; j++)
			if (arr[j].getPriority() < arr[index].getPriority())
			    index = j;

		    Task lessImportant = arr[index];
		    arr[index] = arr[i];
		    arr[i] = lessImportant;
		}

		return arr;
	}



	public static void main(String[] args){

		// print instructions
		System.out.println("enter the tasks to sort.");
		System.out.println("separate the task names and priorities with a colon");
		System.out.println("separate the tasks with spaces (ie- \"taskA:32 taskB:45 ...\")");
		System.out.println("press [enter] when you're done");
		Scanner stdin = new Scanner(System.in);

		// split into name-value pairs
		String[] todoText = stdin.nextLine().split(" ");

		// make an array of new Tasks
		Task[] todoList = new Task[todoText.length];
		for (int i = 0; i < todoList.length; i++)
		   todoList[i] = new Task();
f
		// for each name-value pair
		for (int i = 0; i < todoList.length; i++) {

			// split the name and value into separate strings
			String[] nameValuePair = todoText[i].split(":");
			try {
				todoList[i].setName(nameValuePair[0]);
				todoList[i].setPriority(Integer.parseInt(nameValuePair[1]));
				todoList[i].setCompleted(false);
			// invalid number
			} catch (NumberFormatException e) {
				System.out.println("Invalid number " + nameValuePair[1]);
				System.out.println("Try again.\n");

				// restart the program
				main(args);
				return;
			}
		}


		// sort the tasks by importance
		Task[] sortedList = selectionSortTasks(todoList);

		// print the list
		for (int i = todoList.length - 1; i >= 0; i--)
			System.out.println(todoList.length - i + " : " + sortedList[i].getName() + ":" + sortedList[i].getPriority());

	}



};

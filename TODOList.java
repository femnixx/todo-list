import java.io.File;
import java.util.*;

public class TODOList {
    static Scanner input = new Scanner(System.in);
    static LinkedList<String> list = new LinkedList<>();


    // view function
    static void menu() {
        System.out.println("Please pick a function to start: ");
        System.out.println("""
                1. Add task
                2. View Task
                3. Remove Task
                4. Edit Task
                """);
        int pickTask = input.nextInt();
        input.nextLine();
        switch (pickTask) {
            case 1:
                addTask();
                break;
            case 2:
                viewTask();
                break;
            case 3: 
                removeTask();
                break;
            case 4: 
                editTask();
                break;
            default:
                break;
        }
    }

    // add function
    static void addTask () {
        System.out.print("Task to add: ");
        String taskPlus = input.nextLine();
        list.add(taskPlus);
        System.out.print("Type Y to either add again or anything else to quit: ");
        String addAgain = input.nextLine();
        while (addAgain.equals("Y")) {
            addTask();
         }
         menu(); 
     }

    // remove function 
    static void removeTask() {
        System.out.println("Task to remove (Type -1 to exit): ");
        int taskRemove = input.nextInt();
        input.nextLine();
        if (taskRemove >= 0 && taskRemove < list.size()) {
            list.remove(taskRemove);
            System.out.println("Successfully removed task.");
            viewTask();
        } else if (taskRemove == -1) {
            menu();
        }
         else {
            System.out.println("Not found.");
            removeTask();
        }
    }

    // edit task
    static void editTask() {
        viewTask();
        System.out.println("Which would you like to edit? (Input a number based on the view task, or -1 to return to menu): ");
        int editInput = input.nextInt();  // Get the task number to edit
        input.nextLine();  // Consume the leftover newline character
    
        if (editInput == -1) {
            menu();  // Return to the menu
        }
    
        if (editInput >= 1 && editInput <= list.size()) {
            System.out.print("Input your new or edited task: ");
            String taskEdited = input.nextLine();  // Get the new task description
            list.set(editInput - 1, taskEdited);  // Update the task at the (editInput - 1) index
            System.out.println("Task edited successfully.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
        menu();  // Return to the menu after editing (or invalid input)
    }
    // view task
    static void viewTask() {
        System.out.println("Here are your current tasks.");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("TODO LIST");
        menu();
    }
}

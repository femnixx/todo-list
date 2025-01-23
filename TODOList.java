import java.util.*;

public class TODOList {
    static Scanner input = new Scanner(System.in);
    static LinkedList list = new LinkedList<>();

    // view function
    static void menu() {
        System.out.print("Please pick a function to start: ");
        System.out.println("""
                1. Add task
                2. View Task
                3. Remove Task
                4. Edit Task
                """);
        int pickTask = input.nextInt();
        switch (pickTask) {
            case 1:
                addTask();
                break;
            case 2:
                // actually view task this time
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
        while (addAgain.equals(Y)) {
            addTask();
         }
         return; //supposed to be menu in the future
     }

    // remove function 
    static void removeTask() {
        System.out.println("Task to remove (Type -1 to exit): ");
        int taskRemove = input.nextInt();
        if (list.contains(taskRemove)) {
            list.remove(i);
        } else if (taskRemove == -1) {
            return;
        }
         else {
            System.out.println("Not found.");
            removeTask();
        }
    }

    // edit task
    static void editTask() {
        viewTask();
        System.out.println("Which would you like to edit? (Input a number based on the view task: ) ");
        int  editInput = input.nextInt();
        if (list.contains(editInput)) {
            System.out.print("Input your new or editted task: ");
            String taskEditted = input.nextLine();
            list.set(list.get(editInput), taskEditted);
        } else if (editInput = -1) {
            return;
            menu();
            
        }
         else {
            System.out.println("Input does not contain said index.");
            editTask();
        }
    }

    // view task
    static void viewTask() {
        System.out.println("Here are your current tasks.");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("TODO LIST");
        menu();
    }
}

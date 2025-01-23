import java.util.*;

public class TODOList {
    static Scanner input = new Scanner(System.in);
    static int task = 0;

    // add function
    static void addTask () {
        System.out.print("Task to add: ");
        String taskPlus = input.nextLine();
        System.out.print("Type Y or N to either add again or quit: ");
        String addAgain = input.nextLine();

        if (addAgain.equals("N")) {
            return;
        }
        else if (addAgain.equals("Y")) {
            addTask();
        } else {
            System.out.println("Type Y or N to either add again or quit: ");
        }
    }
    // remove function 
    static void removeTask() {
    }

    public static void main(String[] args) {
        System.out.println("TODO LIST");

    }
}

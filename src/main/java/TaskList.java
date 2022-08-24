import java.util.ArrayList;

/**
* Add the ability to store whatever text entered by the user and display them back to the user when requested.
* */

public class TaskList {
    private ArrayList<Task> taskList = new ArrayList<Task>();

    // constructors

    public TaskList(){
    }

    public String getTaskDescription(int n){
        String taskDescriptionOutput = "  [";
        if (taskList.get(n-1).getIsDone() == true){
            taskDescriptionOutput += "X] ";
        } else {
            taskDescriptionOutput += "] ";
        }
        taskDescriptionOutput += taskList.get(n-1).getTaskDescription() + "\n";
        return taskDescriptionOutput;
    }

    // Display taskList
    public String getTaskList(){
        String listOutput = "";
        for (int i = 1; i <= taskList.size(); i++) {
            listOutput += Integer.toString(i);
            listOutput += " .";
            listOutput += getTaskDescription(i + 1);
        }
        return listOutput;
    }

    // Add new task
    public void addNewTask(String taskDescription) {
        Task newTask = new Task(taskDescription);
        taskList.add(newTask);
    }
    // constructor issue - conflict with add new task and input parser
//    public void addNewTask(String taskDescription, boolean isDone) {
//        Task newTask = new Task(taskDescription, isDone);
//        taskList.add(newTask);
//    }

    // set completed status
    public void setMarkAsCompleted(int n, Boolean bool) {
        taskList.get(n - 1).setIsDone(bool);
    }

}
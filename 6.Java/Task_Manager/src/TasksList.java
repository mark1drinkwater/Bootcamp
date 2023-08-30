import java.util.ArrayList;

public class TasksList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public Task getTaskById(String taskId) {
        for (Task task: tasks) {
            if (task.getTaskId().equals(taskId) ) {
                return task;
            }
        }
        return null;
    }

    public void editTask(Task task) {
        Task existingTask = getTaskById(task.getTaskId());
        
        if (existingTask != null ) {
            existingTask.setDescription(task.getDescription());
            existingTask.setStatus(task.getStatus());
            existingTask.setDueDate(task.getDueDate());
            existingTask.setTitle(task.getTitle());
        }
    }

}

package duke.task;

/**
 * Represents a task to be done.
 */
public class Todo extends Task {
    /**
     * Constructor for the task.
     *
     * @param description description of the thing to be done
     */
    public Todo(String description) {
        super(description);
    }


    /**
     * Convert the task into the specific string for data saving.
     *
     * @return the string representation in the specific format for database
     */
    @Override
    public String stringifyTask() {
        return String.format("T|%d|%s", this.isDone ? 1 : 0, this.description);
    }


    /**
     * Return the string representation of the task.
     *
     * @return string representation of the task
     */
    @Override
    public String toString() {
        return String.format("[T]%s", super.toString());
    }
}

package duke.task;

public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }


    public void markAsDone() {
        this.isDone = true;
    }


    private String getStatus() {
        return this.isDone ? "X" : " ";
    }


    public abstract String stringifyTask();


    @Override
    public String toString() {
        return String.format("[%s] %s", this.getStatus(), this.description);
    }
}

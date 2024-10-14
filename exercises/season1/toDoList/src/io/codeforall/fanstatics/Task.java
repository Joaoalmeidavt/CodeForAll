package io.codeforall.fanstatics;

public class Task implements Comparable<Task>{
    private Importance importance;
    private int priority;
    private String item;

    public Task(Importance importance, int priority, String item){
        this.importance = importance;
        this.priority = priority;
        this.item = item;
    }

    public Importance getImportance() {
        return importance;
    }

    public int getPriority() {
        return priority;
    }

    public String getItem() {
        return item;
    }

    @Override
    public int compareTo(Task task) {
        if(this.importance == task.importance){
            return this.priority - task.priority;
        }
        return this.importance.getImportance() - task.importance.getImportance();
    }
}

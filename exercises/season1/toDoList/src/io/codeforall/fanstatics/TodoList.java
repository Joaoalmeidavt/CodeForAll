package io.codeforall.fanstatics;

import java.util.PriorityQueue;

public class TodoList {
    private PriorityQueue<Task> priorityQueue;
    public Importance importance;

    public TodoList(){
        this.priorityQueue = new PriorityQueue<>();
    }

    public void add(Importance importance, int priority, String name){
        this.priorityQueue.add(new Task(importance, priority, name));
    }

    public String remove(){
        return this.priorityQueue.remove().getItem();
    }

    public boolean isEmpty(){
        return this.priorityQueue.isEmpty();
    }
}

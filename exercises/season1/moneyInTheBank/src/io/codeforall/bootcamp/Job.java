package io.codeforall.bootcamp;

public class Job {
    public String jobTitle;
    public int wage;

    public Job(String title, int wage){
        this.jobTitle = title;
        this.wage = wage;
    }

    public int paycheck(){
        return this.wage;
    }
}

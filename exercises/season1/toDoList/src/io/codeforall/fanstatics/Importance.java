package io.codeforall.fanstatics;

public enum Importance {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int importance;

    Importance(int importance){
        this.importance = importance;
    }

    public int getImportance(){
        return this.importance;
    }
}

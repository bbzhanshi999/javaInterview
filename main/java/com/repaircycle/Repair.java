package com.repaircycle;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
public class Repair {

    private int cycle;

    private long runKilo;

    private int level;

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public long getRunKilo() {
        return runKilo;
    }

    public void setRunKilo(long runKilo) {
        this.runKilo = runKilo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Repair(int cycle, long runKilo, int level) {
        this.cycle = cycle;
        this.runKilo = runKilo;
        this.level = level;
    }
}

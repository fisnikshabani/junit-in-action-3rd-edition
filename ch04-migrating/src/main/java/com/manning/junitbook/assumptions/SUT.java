package com.manning.junitbook.assumptions;

public class SUT {

    private Job currentJob;

    public void run(Job currentJob) {
        this.currentJob = currentJob;
    }

    public boolean hasJobToRun() {
        return currentJob != null;
    }
}

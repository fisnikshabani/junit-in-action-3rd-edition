package com.manning.junitbook.lifecycle;

public class SUT {

    private String systemName;

    public SUT(String systemName) {
        this.systemName = systemName;
        System.out.println(systemName + " from class " + this.getClass().getName() + " is initializing...");
    }

    public boolean canReceiveRegularWork() {
        System.out.println(systemName + " from class " + this.getClass().getName() + " can recieve regular work.");
        return true;
    }

    public boolean canReceiveAdditionalWork() {
        System.out.println(systemName + " from class " + this.getClass().getName() + " cannot recieve additionalWork.");
        return false;
    }

    public void close() {
        System.out.println(systemName + " from class " + this.getClass().getName() + " is closing.");
    }
}

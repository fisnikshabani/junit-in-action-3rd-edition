package com.manning.junitbook.lifecycle;

public class ResourceForAllTests {

    private String resourceName;

    public ResourceForAllTests(String resourceName) {
        this.resourceName = resourceName;
        System.out.println(resourceName + " from class " + this.getClass().getSimpleName() + " is initializing.");
    }

    public void close() {
        System.out.println(resourceName + " from class " + this.getClass().getSimpleName() + " is closed.");
    }
}

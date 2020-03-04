package ru.yandex.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before()
    public void start() {
        System.out.println("start");
    }

    @After()
    public void end() {
        System.out.println("end");
    }
}

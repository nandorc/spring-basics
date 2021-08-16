package com.dsoft.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    // AbstractApplicationContext context = new
    // ClassPathXmlApplicationContext("com/dsoft/beanlifecycle/Beans.xml");
    AbstractApplicationContext context = new ClassPathXmlApplicationContext(
        "com/dsoft/beanlifecycle/Beans_defaults.xml");
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();
    context.registerShutdownHook();
  }
}

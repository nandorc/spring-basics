package com.dsoft.beanscopes.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("com/dsoft/beanscopes/prototype/Beans.xml");
    HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
    objA.setMessage("I'm object A");
    objA.getMessage();
    HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
    objB.getMessage();
  }
}

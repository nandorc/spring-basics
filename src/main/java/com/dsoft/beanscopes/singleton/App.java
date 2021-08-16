package com.dsoft.beanscopes.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("com/dsoft/beanscopes/singleton/Beans.xml");
    HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
    objA.setMessage("I'm objet A");
    objA.getMessage();
    HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
    objB.getMessage();
  }
}

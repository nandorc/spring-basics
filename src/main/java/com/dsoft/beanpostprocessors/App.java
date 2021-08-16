package com.dsoft.beanpostprocessors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/dsoft/beanpostprocessors/Beans.xml");
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();
    context.registerShutdownHook();
  }
}

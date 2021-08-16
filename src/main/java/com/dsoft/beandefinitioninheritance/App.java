package com.dsoft.beandefinitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    // ApplicationContext context = new ClassPathXmlApplicationContext("com/dsoft/beandefinitioninheritance/Beans.xml");
    ApplicationContext context = new ClassPathXmlApplicationContext("com/dsoft/beandefinitioninheritance/Beans_beanTemplate.xml");
    HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
    objA.getMessage1();
    objA.getMessage2();
    HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
    objB.getMessage1();
    objB.getMessage2();
    objB.getMessage3();
  }
}

package com.dsoft.dependencyinjection.constructorbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/dsoft/dependencyinjection/constructorbased/Beans.xml");

    TextEditor te = (TextEditor) context.getBean("textEditor");
    te.spellCheck();
  }
}

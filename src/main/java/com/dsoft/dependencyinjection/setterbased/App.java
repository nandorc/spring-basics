package com.dsoft.dependencyinjection.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "com/dsoft/dependencyinjection/setterbased/Beans.xml");

    TextEditor te = (TextEditor) context.getBean("textEditor");
    te.spellCheck();
  }
}

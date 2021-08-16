package com.dsoft.injectinginnerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("com/dsoft/injectinginnerbeans/Beans.xml");
    TextEditor te = (TextEditor) context.getBean("textEditor");
    te.spellCheck();
  }
}

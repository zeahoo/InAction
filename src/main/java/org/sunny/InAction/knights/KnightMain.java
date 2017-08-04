package org.sunny.InAction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.sunny.InAction.config.KnightConfig;

public class KnightMain {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
  }

}

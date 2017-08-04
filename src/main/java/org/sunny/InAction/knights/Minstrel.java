package org.sunny.InAction.knights;

import java.io.PrintStream;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Minstrel {

  private PrintStream stream;

  public Minstrel(PrintStream stream) {
    this.stream = stream;
  }

  @Pointcut("execution(* *.embarkOnQuest(..))")
  public void embark() {
  }
  @Before("embark()")
  public void singBeforeQuest() {
    stream.println("Fa la la, the knight is so brave!");
  }

  @After("embark()")
  public void singAfterQuest() {
    stream.println("Tee hee hee, the brave knight did embark on a quest!");
  }
//  @Before("execution(* *.embarkOnQuest(..))")
//  public void singBeforeQuest() {
//    stream.println("Fa la la, the knight is so brave!");
//  }
//
//  @After("execution(* *.embarkOnQuest(..))")
//  public void singAfterQuest() {
//    stream.println("Tee hee hee, the brave knight did embark on a quest!");
//  }
}
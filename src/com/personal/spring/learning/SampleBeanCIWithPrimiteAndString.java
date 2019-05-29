package com.personal.spring.learning;

//Constructor Injection with primitive and String based values
public class SampleBeanCIWithPrimiteAndString {
  private int id;
  private String name;

  public SampleBeanCIWithPrimiteAndString() {System.out.println("def cons");}

  public SampleBeanCIWithPrimiteAndString(int id) {
    this.id = id;
  }

  public SampleBeanCIWithPrimiteAndString(String name) {
    this.name = name;
  }

  public SampleBeanCIWithPrimiteAndString(int id, String name) {
    this.id = id;
    this.name = name;
  }

  void show(){
    System.out.println(id+" "+name);
  }
}


/*

<?xml version = "1.0" encoding = "UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN" "http://www.springframework.org/dtd/spring-beans-2.0.dtd">
<beans>
    <bean id = "id1" class = "SampleBeanCIWithPrimiteAndString">
        <constructor-arg value="SuryamNaidu"></constructor-arg>
        <constructor-arg value="10" type="int"></constructor-arg>

    </bean>
</beans>


//setter Injection example
public class SampleBean {
  private String message;
  private int num;
  public void setMessage(String message) {
    this.message = message;
  }
  public void setNum(int number) {
    this.num = number;
  }
  void display(){
    System.out.print("Sample bean initialized " + message + num);
  }
}*/

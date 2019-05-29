package com.personal.spring.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
  public static void main(String args[])
  {
    Resource rs = new ClassPathResource("spconfig.xml");
    BeanFactory factory = new XmlBeanFactory(rs);
    SampleBeanCIWithPrimiteAndString sb = (SampleBeanCIWithPrimiteAndString)factory.getBean("id1");
    sb.show();


  }
}
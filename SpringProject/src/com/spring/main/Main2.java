package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.pojo.SpringPojo1;
import com.spring.pojo.SpringPojo2;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// instead of beanfactory we can use 	Apllication context class
ApplicationContext ap=new ClassPathXmlApplicationContext("Spring2.xml");// eager container

// create test class object


// using aplicaton context
Object o=(Object)ap.getBean("sp2");

SpringPojo2 sp1=(SpringPojo2) o;
sp1.print();
	}

}

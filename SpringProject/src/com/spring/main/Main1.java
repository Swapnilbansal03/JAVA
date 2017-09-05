package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.pojo.SpringPojo1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find xml
Resource r= new ClassPathResource("Spring1.xml");

 //load xml inti container
BeanFactory factory= new XmlBeanFactory(r);//lazy conatiner

// instead of beanfactory we can use 	Apllication context class
ApplicationContext ap=new ClassPathXmlApplicationContext("Spring1.xml");// eager container

// create test class object
Object o=(Object)factory.getBean("sp1");
Object o1=(Object)factory.getBean("sp1");
Object o2=(Object)factory.getBean("sp1");

// using aplicaton context
Object o3=(Object)ap.getBean("sp1");

SpringPojo1 sp=(SpringPojo1) o3;
sp.print();
	}

}

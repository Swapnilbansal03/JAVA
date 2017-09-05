package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.pojo.SpringPojo1;
import com.spring.pojo.SpringPojo2;
import com.spring.pojo.SpringPojoSecondry;

public class MainSecondry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// instead of beanfactory we can use 	Apllication context class
ApplicationContext ap=new ClassPathXmlApplicationContext("SpringSecondry.xml");// eager container

// create test class object


// using aplicaton context
Object o=(Object)ap.getBean("s");

SpringPojoSecondry sp1=(SpringPojoSecondry) o;
sp1.print();
	}

}

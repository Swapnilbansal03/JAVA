package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.pojo.SpringPojo1;
import com.spring.pojo.StudentCity;

public class MainCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringCity.xml");
	Object o=(Object)context.getBean("sc");
	StudentCity sc= (StudentCity) o;
	sc.print();
	}
}

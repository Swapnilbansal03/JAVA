package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext c=new ClassPathXmlApplicationContext("Spring1.xml");
Car1 c1=(Car1)c.getBean("c");
c1.print();
	}

}

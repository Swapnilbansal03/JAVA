package main;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import beans.Student;
import dao.StudentDaoImpl;

public class MainDao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*DriverManagerDataSource dm= new DriverManagerDataSource();
dm.setDriverClassName("oracle.jdbc.driver.OracleDriver");
dm.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
dm.setUsername("hr");
dm.setPassword("hr");

for(int i=0;i<15;i++) {
	Connection con=dm.getConnection();
	System.out.println(con+" :"+i);
} */
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("Spring.xml");
		StudentDaoImpl dao=(StudentDaoImpl) ctx.getBean("sd");
		int status=dao.save(new Student(2,"swapnil","A-69","sw@gmail.com"));
System.out.println(status);
	}

}

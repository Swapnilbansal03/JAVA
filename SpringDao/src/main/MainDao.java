package main;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainDao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
DriverManagerDataSource dm= new DriverManagerDataSource();
dm.setDriverClassName("oracle.jdbc.driver.OracleDriver");
dm.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
dm.setUsername("hr");
dm.setPassword("hr");

for(int i=0;i<15;i++) {
	Connection con=dm.getConnection();
	System.out.println(con+" :"+i);
} 

	}

}

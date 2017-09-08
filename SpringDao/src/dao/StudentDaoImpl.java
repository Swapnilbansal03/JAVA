package dao;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import beans.Student;

public class StudentDaoImpl implements StudentDao{

	/*private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}*/
	
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	@Override
	public int save(Student st) {
		
		// TODO Auto-generated method stub
		/*Connection con=ds.getConnection();
		Statement stmt=con.createStatement();  
		  
		int result=stmt.executeUpdate("insert into student values('"+st.getId()+"','"+st.getName()
		+"','"+st.getAddress()+"','"+st.getEmail()+"')");
		return result;*/
		
		String query= "insert into student values('"+st.getId()+"','"+st.getName()+"','"+st.getAddress()+"','"+st.getEmail()+"')";
		return jt.update(query);
		
	}

	

	



	@Override
	public boolean update(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}

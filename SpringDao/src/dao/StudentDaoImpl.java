package dao;

import java.sql.Connection;

import javax.sql.DataSource;

import beans.Student;

public class StudentDaoImpl implements StudentDao{

	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	@Override
	public int save(Student st) throws Exception {
		// TODO Auto-generated method stub
		Connection con=ds.getConnection();
		return 0;
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

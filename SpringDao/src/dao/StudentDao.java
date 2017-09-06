package dao;

import beans.Student;

public interface StudentDao {

	public int save(Student st) throws Exception;
	public boolean update(Student st) throws Exception;
	public boolean delete(Student st) throws Exception;
	
}

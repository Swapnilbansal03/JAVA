package dao;

import beans.Employee;

public interface EmployeeDao {
	
	public int save(Employee e);
	public boolean delete(Employee e);

}

package dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int save(Employee e) {
		// TODO Auto-generated method stub
		int i=(int) ht.save(e);
		return 0;
	}

	@Override
	public boolean delete(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

}

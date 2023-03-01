package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();		
		
		System.out.println("Test #1: Department insert ");
		Department department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Inserted! New Id: " + department.getId());
		
		System.out.println("Test #2: Department update ");
		Department dep = new Department(6, "Dance");
		departmentDao.update(dep);
		System.out.println("Updated!");
		
		System.out.println("Test #3: Department findById");
		Department dep2 = departmentDao.findById(1);
		System.out.println(dep2);


	}

}

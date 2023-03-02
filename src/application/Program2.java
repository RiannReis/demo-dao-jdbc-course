package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();		
		
		System.out.println("Test #1: Department insert ");
		Department department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Inserted! New Id: " + department.getId());
		
		System.out.println("\nTest #2: Department update ");
		Department dep = new Department(6, "Dance");
		departmentDao.update(dep);
		System.out.println("Updated!");
		
		System.out.println("\nTest #3: Department findById");
		Department dep2 = departmentDao.findById(1);
		System.out.println(dep2);

		System.out.println("\nTest #4: Department findAll");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\nTest #5: Department delete");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}

}

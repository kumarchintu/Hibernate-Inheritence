package info.inetsolv.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import info.inetsolv.entity.Employee;

public class App {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmployeeNumber(2);
		employee.setEmployeeSalary(20000d);
		employee.setFirstName("Anil");
		employee.setMiddleName("Kumar");
		employee.setLastName("Gupta");
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();	
	}
}
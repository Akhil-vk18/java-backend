package hqlproject.Hql_Project;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Employee employee = new Employee(5, "Akhil5", "cs");
		Configuration config = new Configuration();
		config.addAnnotatedClass(hqlproject.Hql_Project.Employee.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		// fetching using hql 
		String query ="from Employee";//here we need to pass the entity name
	Query q=	session.createQuery(query);
	List<Employee> list=q.list();
	for (Employee employee : list) {
		System.out.println(employee);
	}
		
//		session.save(employee);
		t.commit();
		sf.close();

		System.out.println("data fetched");

	}
}

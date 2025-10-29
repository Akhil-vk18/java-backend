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

//		// fetching using hql 
//		String query ="from Employee where name =:x";//here we need to pass the entity name
//	Query q=	session.createQuery(query);
//	q.setParameter("x", "akhil");//setting value to the x 
	//or we can set like this 
//	String userinput = "akhil";
//	q.setParameter("x", userinput);
//	List<Employee> list=q.list();
//	for (Employee employee : list) {
//		System.out.println(employee);
//	}
	Query query =	session.createQuery("update Employee set dept ='ece' where id =3");//updating dept of id =3
int num =	query.executeUpdate();
System.out.println("rows effected : "+ num);
//		session.save(employee);
		t.commit();
		sf.close();

		System.out.println("data updated");

	}
}

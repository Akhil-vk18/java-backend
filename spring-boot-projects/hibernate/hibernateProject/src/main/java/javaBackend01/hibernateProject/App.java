package javaBackend01.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Student s1=new Student();
//		s1.setId(3);
//		s1.setName("Akhil");
//		s1.setStudentclass("S8");
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta =new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session session =sf.openSession();
		Transaction t = session.beginTransaction(); 
		s1=session.get(Student.class, 3);
		System.out.print(s1);
		t.commit();
//		System.out.print("successfully updated");
		sf.close();
		session.close();
	}
}

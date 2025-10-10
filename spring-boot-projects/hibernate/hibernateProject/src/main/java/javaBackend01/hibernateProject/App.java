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
		Marks m =new Marks();
		Student s1=new Student();
		s1.setId(8);
		s1.setName("kitler");
		s1.setStudentclass("S8");
		s1.setStudent_marks(m);
		m.setComputer(50);
		m.setMaths(40);
		m.setPhysics(45);
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta =new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session session =sf.openSession();
		Transaction t = session.beginTransaction(); 
//		s1=session.get(Student.class, 3);
		session.save(s1);
		System.out.print(s1);
		t.commit();
		System.out.print("inserted successfully");
		sf.close();
		session.close();
	}
}

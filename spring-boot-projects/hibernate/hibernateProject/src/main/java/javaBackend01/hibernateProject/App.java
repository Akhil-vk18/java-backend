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
		Marks m = new Marks();
		Student s1 = new Student();
//		s1.setId(2);
//		s1.setName("Akhil 2");
//		s1.setStudentclass("S8");
//		s1.setStudent_marks(m);
//		m.setComputer(60);
//		m.setMaths(30);
//		m.setPhysics(45);

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		s1 = session.get(Student.class, 1);
//		session.save(s1);
		System.out.print(s1);
		t.commit();
		Session session2 = sf.openSession();
		Transaction t2 = session.beginTransaction();
		//since we are fetchin same data the query will executed once and cached by second level caching 
		s1 = session2.get(Student.class, 1);
		System.out.print(s1);
		t2.commit();
//		System.out.print("inserted successfully");
		sf.close();
		session.close();
		session2.close();
	}
}

package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.Employee;
public class Client {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory= meta.getSessionFactoryBuilder().build();
		
		//Store Employee object in the table
		
		//1. Create Employee object
		Employee employee1 = new Employee();
		employee1.setEmpName("Hari");
		employee1.setDesignation("Developer");
		
		Employee employee2 = new Employee();
		employee2.setEmpName("Ram");
		employee2.setDesignation("Tester");
		
		//2. Create session object using SessionFactory
		Session session = factory.openSession();
		
		//3.Create transaction object using Session
		Transaction transaction = session.beginTransaction();
		
		//4. Save the object in the DB table
		Integer empId1 = (Integer) session.save(employee1);
		System.out.println("Employee ID1: " +empId1);
		Integer empId2 = (Integer) session.save(employee2);
		System.out.println("Employee ID2: " +empId2);
		
		transaction.commit();
		session.close();
		factory.close();
	}

}

package com.evry.hospitalManagement;

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
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    	StandardServiceRegistry sr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(sr).getMetadataBuilder().build(); 
    	
    	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
    	Session session = factory.openSession();  
    	Transaction t = session.beginTransaction(); 
    	
    	Patient cust=new Patient();
    	cust.setName("nalina");
    	cust.setDoctor("Manoj");
    	
    	OutPatient rcust=new OutPatient();
    	rcust.setName("Raj");
    	rcust.setDoctor("Manoj");
    	rcust.setOutPatientBill(100);
    	rcust.setOutPatientTest("B.P");
    	
    	InPatient pcust =new InPatient();
    	pcust.setName("rama");
    	
    	session.persist(cust);
    	session.persist(rcust);
    	session.persist(pcust);
    	t.commit();
    	
    	System.out.println("Done,go to Home");
    	session.close();
    	factory.close();
    }
}

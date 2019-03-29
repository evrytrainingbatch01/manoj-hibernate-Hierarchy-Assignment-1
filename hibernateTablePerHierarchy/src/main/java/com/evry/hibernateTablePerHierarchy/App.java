package com.evry.hibernateTablePerHierarchy;

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
    	
    	Customer cust=new Customer();
    	cust.setName("Manoj");

    	
    	RegularCustomer rcust=new RegularCustomer();
    	rcust.setPrice(0);
    	rcust.setName("Raj");
    	
    	PartialCustomer pcust =new PartialCustomer();
    	pcust.setParamount(100);
    	pcust.setParPrice(0);
    	
    	session.persist(cust);
    	session.persist(rcust);
    	session.persist(pcust);
    	t.commit();
    	
    	System.out.println("Done,go to Home");
    	session.close();
    	factory.close();
    }
}

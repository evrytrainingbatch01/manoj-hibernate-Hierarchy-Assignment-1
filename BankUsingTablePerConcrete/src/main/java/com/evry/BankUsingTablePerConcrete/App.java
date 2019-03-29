package com.evry.BankUsingTablePerConcrete;

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
    	
    	ParentBankAccount pbacc=new ParentBankAccount();
    	pbacc.setParentname("Manoj");
    	pbacc.setParentBalance(1000);
    	
    	ChildSavingAccount SavAcc=new ChildSavingAccount();
    	//SavAcc.setParentname("manoj");
    	SavAcc.setSavingBalance(500);
    	SavAcc.setAccName("saving");
    	
    	ChildsalaryAccount SalAcc=new ChildsalaryAccount();
    	SalAcc.setSalaryBalance(600);
    	SalAcc.setAccName("salary");
    	
    	session.persist(pbacc);
    	session.persist(SavAcc);
    	session.persist(SalAcc);
    	t.commit();
    	
    	System.out.println("Done,go to Home");
    	session.close();
    	factory.close();
    }
}

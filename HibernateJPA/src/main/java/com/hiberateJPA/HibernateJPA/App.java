package com.hiberateJPA.HibernateJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("myObj");
        EntityManager eManager=emf.createEntityManager();
        EntityTransaction eTrans=eManager.getTransaction();
        eTrans.begin();
        
        /* CREATE */
        Student s=new Student("120908","Jhinge POSTO",12,21,9008L); 
        eManager.persist(s);       
        
        /* READ */
        s=eManager.find(Student.class,"12022002019049");
        if(s!=null)
            System.out.println(s.getName());
        
        /* UPDATE */
        s=eManager.find(Student.class, "12022002019049");
        if(s!=null)
            s.setAge(21);
        
        /* DELETE */
        s=eManager.find(Student.class,"120908");
        if(s!=null)
            eManager.remove(s);
        
        eTrans.commit();
    }
}

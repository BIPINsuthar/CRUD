package com.bipin.CRUD_table_.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bipin.CRUD_table_.entity.Student;

public class Student_Dao
{
	
	public void saveUser(Student student)
	{
		Transaction t=null;
		try
		{
		Configuration c=new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		t=s.beginTransaction();
		s.save(student);
		t.commit();
		}
		catch(Exception e)
		{
			if(t!=null)
			{
				t.rollback();
			}
			System.out.println("Error::"+e);
		}
	}
	
	public void updateUser(Student student)
	{
		Transaction t=null;
		try
		{
			Configuration c=new Configuration().configure().addAnnotatedClass(Student.class);
			SessionFactory sf=c.buildSessionFactory();
			Session s=sf.openSession();
			t=s.beginTransaction();
			s.update(student);
			t.commit();
		}
		catch(Exception e)
		{
			if(t!=null)
			{
				t.rollback();
			}
			System.out.println("Error::"+e);
		}
	}
	
	public void deleteUser(int id)
	{
		Transaction t=null;
		try
		{
			Student student=null;
			Configuration c=new Configuration().configure().addAnnotatedClass(Student.class);
			SessionFactory sf=c.buildSessionFactory();
			Session s=sf.openSession();
		    t=s.beginTransaction();
		    student =s.get(Student.class, id);
		    if(student!=null)
		    {
		    	s.delete(student);
		    	System.out.println("user deleted successfully done!");
		    }
			
			t.commit();
		}
		catch(Exception e)
		{
			if(t!=null)
			{
				t.rollback();
			}
			System.out.println("Error::"+e);
		}
		
	}
	
	public Student getUser(int id)
	{
		Transaction t=null;
		Student student=null;
		try
		{
		
			Configuration c=new Configuration().configure().addAnnotatedClass(Student.class);
			SessionFactory sf=c.buildSessionFactory();
			Session s=sf.openSession();
		    t=s.beginTransaction();
		    student=s.get(Student.class,id);
		    t.commit();
			
		}
		catch(Exception e)
		{
			if(t!=null)
			{
				t.rollback();
			}
	
			System.out.println("Error::"+e);
		}
		
		return student;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Student> getAlluser(String query)
	{
	    String value=query;
		Transaction t=null;
		List<Student> student=null;
		try
		{
			Configuration c=new Configuration().configure().addAnnotatedClass(Student.class);
			SessionFactory sf=c.buildSessionFactory();
			Session s=sf.openSession();
		    t=s.beginTransaction();
		    Query q;
		    if(value!=null)
		    {
		    	 q=s.createQuery("from Student_table where  Name like '%"+value+"%' or Email like '%"+value+"%' or Phone like '%"+value+"%' or Address like '%"+value+"%' ");	
		    	
				
		    }
		    else
		    {
		    	 q=s.createQuery("from Student_table order by ID");	       
		    }
		    
		    student=q.getResultList();
			t.commit();
			
		}
		catch(Exception e)
		{
			if(t!=null)
			{
				t.rollback();
			}
			System.out.println("Error::"+e);
		}
		
		return student;
	}
	


}

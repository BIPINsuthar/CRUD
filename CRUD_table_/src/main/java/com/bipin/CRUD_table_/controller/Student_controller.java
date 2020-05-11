package com.bipin.CRUD_table_.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bipin.CRUD_table_.dao.Student_Dao;
import com.bipin.CRUD_table_.entity.Student;


@Controller
public class Student_controller
{
	@SuppressWarnings("unused")
	public void init()
	{
		Student_Dao dao=new Student_Dao();
	}
	
	@RequestMapping({"new","index","update"})
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException 
	{
		doGet(req,res);
		
	}
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		String action=req.getServletPath();
		
		try
		{
			switch(action)
			{
			case "/new":
				shownewForm(req,res);
				 break;
			case "/update":
				showupdate(req,res);
		
			default:
				showlist(req,res);
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println("Errror::"+e);
		}
	
	}

	
	private void showupdate(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");
		
		Student s=new Student();
		s.setID(id);
		s.setName(name);
		s.setEmail(email);
		s.setPhone(phone);
		s.setAddress(address);
		
		Student_Dao dao=new Student_Dao();
		dao.updateUser(s);
		
		res.sendRedirect("index");
	
		
		
	}

	private void showlist(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		res.sendRedirect("index");
		
	}

	private void shownewForm(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");

		
		Student s=new Student();
		s.setID(id);
		s.setName(name);
		s.setEmail(email);
		s.setPhone(phone);
		s.setAddress(address);
		
		Student_Dao dao=new Student_Dao();
		dao.saveUser(s);
	
		res.sendRedirect("index");
		
	}
	

}

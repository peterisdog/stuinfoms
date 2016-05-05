package com.tqmars.daotest;

import com.tqmars.dao.IStuinfoms;
import com.tqmars.daoimpl.Stuinfoms;
import com.tqmars.domain.Student;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DaoTest extends TestCase{
	private IStuinfoms dao = new Stuinfoms();
	
	public void testAdd() {
		Student stu = new Student();
		stu.setId("001");
		stu.setName("zs");
		
		dao.add(stu);
		Student s = dao.query("001");
		Assert.assertEquals(s, stu);
		
	}

	public void testQuery()
	{
		
	}
	
	public void testDel()
	{}
	
	public void testModify()
	{
		
	}
	
}

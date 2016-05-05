package com.tqmars.dao;

import com.tqmars.domain.Student;

//The data layer interface
public  interface IStuinfoms {

	// add:incoming a Student paramete, add this student's information in system
	public void add(Student s);

	// remove:incoming a Student parameter,remove this student's information
	// form system
	public void del(Student s);

	// query:incoming a student's id,query this student's information
	public Student query(String id);

	// modify:incoming a student's id,modify this student's information
	public void modify(String id);
}

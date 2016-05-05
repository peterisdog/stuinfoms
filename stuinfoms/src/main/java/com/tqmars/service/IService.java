package com.tqmars.service;

import com.tqmars.domain.Student;

//The server layer interface
public interface IService {
	// add function service
	public void add(Student s);

	// delete function service
	public void del(Student s);

	// query function service
	public Student query(String id);

	// modify function service
	public void modify(String id);

}

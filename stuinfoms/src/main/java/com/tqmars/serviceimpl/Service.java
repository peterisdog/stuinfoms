package com.tqmars.serviceimpl;

import com.tqmars.dao.IStuinfoms;
import com.tqmars.domain.Student;
import com.tqmars.service.IService;

//Service Interface method implementation
public class Service implements IService {
	// IStuinfoms dao
	private IStuinfoms dao;

	// service consturction
	public Service(IStuinfoms dao) {
		super();
		this.dao = dao;
	}

	@Override
	// add function service
	public void add(Student s) {
		dao.add(s);

	}

	@Override
	// delete function service
	public void del(Student s) {
		dao.del(s);

	}

	@Override
	// query function service
	public Student query(String id) {
		return dao.query(id);

	}

	@Override
	// modify function service
	public void modify(String id) {
		dao.modify(id);

	}

}

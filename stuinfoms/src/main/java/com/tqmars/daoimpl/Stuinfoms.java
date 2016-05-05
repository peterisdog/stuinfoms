package com.tqmars.daoimpl;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import com.tqmars.dao.IStuinfoms;
import com.tqmars.domain.Student;

//Data Interface method implementation
public class Stuinfoms  implements IStuinfoms {

	// private property:new a list to load students data
	private static List<Student> l = new ArrayList<>();
	private Scanner sc;

	@Override
	// add function:Direct invocation List's add function
	public void add(Student s) {

		l.add(s);

	}

	@Override
	// delete function:Direct invocation List's remove function
	public void del(Student s) {
		l.remove(s);

	}

	@Override
	// query function:for-each cycle get the student from the list l
	public Student query(String id) {
		for (Student s : l) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;

	}

	@Override
	// modify function:for-each cycle to get the student's information;input the
	// data to modify this student' information
	public void modify(String id) {

		for (Student s : l) {
			if (s.getId().equals(id)) {
				sc = new Scanner(System.in);
				System.out.println("学生id : " + s.getId());
				System.out.println("学生姓名 : " + s.getName());
				System.out.println("请输入新id：");
				s.setId(sc.nextLine());
				System.out.println("请输入新姓名：");
				s.setName(sc.nextLine());

			}
		}
	}
	

}

package com.tqmars.persentation;

import java.util.Scanner;
import com.tqmars.dao.IStuinfoms;
import com.tqmars.daoimpl.Stuinfoms;
import com.tqmars.domain.Student;
import com.tqmars.service.IService;
import com.tqmars.serviceimpl.Service;

//the main class
public class Main {
	static Scanner sc = new Scanner(System.in);
	static IStuinfoms dao = new Stuinfoms();
	static IService service = new Service(dao);

	// the mian function entry:welcome UI and died cycle
	public static void main(String[] args) {
		while (true) {
			welcome();
			switch (system_in()) {
			// add the student's information entry
			case "1":
				clear();
				Student temp1 = new Student();
				System.out.println("请输入学生姓名");
				temp1.setName(system_in());
				System.out.println("请输入学生学号");
				temp1.setId(system_in());
				service.add(temp1);
				System.out.println("已经成功增加学生" + temp1.getName());
				System.out.println("按任意键返回主界面");
				system_in();
				clear();
				break;

			// delete the student's information entry
			case "2":
				clear();
				Student temp2 = new Student();
				System.out.println("请输入需要删除的学生id");
				temp2 = service.query(system_in());
				System.out.println("确定要删除学生" + temp2.getName() + "?,删除后无法恢复");
				System.out.println("按1确认删除，按其他键取消");
				if ("1".equals(system_in())) {
					service.del(temp2);
					System.out.println("已经成功删除学生" + temp2.getName() + "的信息");
					System.out.println("按任意键返回主界面");
					system_in();
					clear();
					break;
				}
				System.out.println("您输入的功能键有误，跳转回主页面");
				break;

			// query the student's information entry
			case "3":
				clear();
				System.out.println("请输入学生id");
				Student temp3 = service.query(system_in());
				// judge the student's information exitance or not
				if (temp3 == null) {
					System.out.println("未查到该学生信息");
					clear();
					break;
				}
				clear();
				System.out.println("学生id : " + temp3.getId());
				System.out.println("学生姓名 : " + temp3.getName());
				System.out.println("按任意键返回主界面");
				system_in();
				clear();
				break;
			// modify the student's information entry
			case "4":
				clear();
				System.out.println("请输入学生id");
				service.modify(system_in());
				System.out.println("您已经成功修改学生信息");
				System.out.println("按任意键返回主界面");
				system_in();
				clear();
				break;

			// exit the Student Information Management System
			case "5":
				System.out.println("即将退出学生管理系统，欢迎再次使用");
				System.exit(1);
				break;

			// default
			default:
				System.out.println("您的输入有误，请重新输入");
				break;
			}
		}
	}

	// print the welcome screen
	private static void welcome() {
		System.out.println("请选择要使用的功能代号");
		System.out.println("1 新增学生信息");
		System.out.println("2 删除学生信息");
		System.out.println("3 查询学生信息");
		System.out.println("4 修改学生信息");
		System.out.println("5 退出管理系统");
	}

	// clear the screen
	private static void clear()

	{
		String os = System.getProperty("os.name");
		try {
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				for (int i = 0; i < 25; i++) {
					System.out.println("\n");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// input function simplify
	private static String system_in() {
		String x = sc.nextLine();
		return x;
	}
}

package tst.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import tst.project.bean.StudentBean;
import tst.project.page.PageBean;
import tst.project.service.StudentService;

@Controller
@RequestMapping("/studentController")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	@ResponseBody//响应体返回是调用需要进行编码设置,不设置 默认会返回一个jsp页面、、produces="application/json;charset=UTF-8"
	@RequestMapping(value="/getStudents",produces="application/xml;charset=UTF-8")
	public String getStudents(StudentBean studentBean,HttpServletRequest request,HttpServletResponse response) throws Exception{
		PageBean pageBean=new PageBean();
		Object studentBeans=studentService.getStudents(studentBean,pageBean);
		String a=new Gson().toJson(studentBeans);
		System.out.println(a);
//		response.getWriter().write(a);
		System.out.println("--");
		
		return a;	
	}
	

}

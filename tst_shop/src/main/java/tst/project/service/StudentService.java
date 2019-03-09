package tst.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tst.project.bean.StudentBean;
import tst.project.dao.StudentDao;
import tst.project.page.PageBean;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	public List<StudentBean> getStudents(StudentBean studentBean,PageBean pageBean) {
		
		return studentDao.getStudents(studentBean,pageBean);
	}

}

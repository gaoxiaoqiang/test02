
package tst.project.test;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tst.project.bean.StudentBean;
import tst.project.page.PageBean;
import tst.project.service.StudentService;
 
public class DubboProvider {
 
	public static void main(String[] args) {
		try {
			// 用于加载Spring的配置文件
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"/applicationContext.xml");
			StudentService StudentService=	context.getBean("studentService",StudentService.class);
		List<StudentBean>students=	StudentService.getStudents(new StudentBean(), new PageBean().setPage(1));
		System.out.println(students);
		} catch (Exception exception) {
			throw new RuntimeException("DubboProvider context start error: "
					+ exception);
		}
		synchronized (DubboProvider.class) {
			while (true) {
				try {
					DubboProvider.class.wait();
				} catch (InterruptedException e) {
					throw new RuntimeException("synchronized error: " + e);
				}
			}
 
		}
 
	}
}

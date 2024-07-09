package springmvc_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.bytebuddy.matcher.ModifierMatcher.Mode;
import springmvc_1.dao.EmployeeCrud;
import springmvc_1.dto.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeCrud crud;
	@RequestMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		ModelAndView view=new ModelAndView();
		try {
			crud.saveEmployee(employee);
			view.setViewName("login.jsp");
			view.addObject("msg","login success");
			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
			view.setViewName("register.jsp");
			view.addObject("msg","incorrect data");
		}
		return view;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginEmployee(@RequestParam String email,@RequestParam String pwd) {
		ModelAndView view=new ModelAndView();
		try {
			Employee db = crud.findByEmail(email);
			List<Employee> li = crud.fetchAll();
			if(db.getPwd().equals(pwd)) {
				System.out.println("login successs");
				System.out.println(db);
				view.setViewName("printall.jsp");
				view.addObject("list",li);
			}
			else{
				view.setViewName("login.jsp");
				view.addObject("msg1","please enter the correct password");
			}
		} catch (Exception e) {
			e.printStackTrace();
			view.setViewName("login.jsp");
			view.addObject("msg1","please enter the correct email");
		}
		
		return view;
	}
}

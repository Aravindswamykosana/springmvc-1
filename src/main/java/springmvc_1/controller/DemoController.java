package springmvc_1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc_1.dto.Employee;

@Controller
public class DemoController {
	
	@RequestMapping("/msg")
	public ModelAndView msg(){
		ModelAndView view=new ModelAndView();
		view.setViewName("printmsg.jsp");
		view.addObject("msg","hi students welcome to mvc");
		return view;
	}
	
	@RequestMapping("/emp")
	public ModelAndView printAllEmployee() {
		List<Employee>li=new ArrayList<Employee>();
		li.add(new Employee(1, "arvind", "a@gmail.com", "s143","software", 454512, 2123.0));
		li.add(new Employee(2, "swamy", "r@gmail.com", "r143","engineer", 123456787l, 2222.0));
		ModelAndView view=new ModelAndView();
		view.setViewName("printemployee.jsp");
		view.addObject("emp",li);
		return view;
	}
}

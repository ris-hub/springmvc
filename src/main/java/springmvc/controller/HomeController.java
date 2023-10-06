package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path= "/home", method=RequestMethod.POST)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Rishabh Prasad");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is Controller Url");
		return "about";
	}
	
	//services
	@RequestMapping("/services")
	public String services() {
		System.out.println("this is services url");
		return "services";
	}
	
	//help
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help");
		
		//creating model and view object
		ModelAndView modelandview = new ModelAndView();
		
		//setting the data
		modelandview.addObject("name", "Rishabh");
		modelandview.addObject("roll_number", 99);
		
		LocalDateTime now = LocalDateTime.now();
		modelandview.addObject("time", now);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(232);
		list.add(3242);
		list.add(34432);
		list.add(3204);
		
		modelandview.addObject("marks", list);
		
		//setting the view name
		modelandview.setViewName("help");
		return modelandview;
	}
	
}

package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
//@RequestMapping("/first")
public class HomeController 
{
	@RequestMapping("/index")	
	public String index(Model model)
	{
		//************** Using ModelAndView *******************************
		
		model.addAttribute("name","Ahsan Shareef");
		
		
		
		 List<String> friends= new ArrayList<String>(); 
		  														friends.add("ahsan");
		  														friends.add("shoeab"); 
		  														friends.add("zaki");
		  
		  model.addAttribute("f",friends);
		 
		
		
		System.out.println("this is home url");
		
		return "index";    //************It Returns "Page-name"******************
	}
	
	
	
	
	@RequestMapping("/help")
	public ModelAndView help()
	{					
			//************** Using ModelAndView *******************************
		ModelAndView modelAndView=new ModelAndView();
		
				modelAndView.addObject("name","Ahsan Shareef");
				
	//*********************** To Get Date&Time *************************************
				
				LocalDateTime dateTime=LocalDateTime.now();
				modelAndView.addObject("dtAndTm", dateTime);
				
				modelAndView.addObject("rollNumber",7027);
				
				List<Integer> marks=new ArrayList<Integer>();
								marks.add(872);
								marks.add(345);
								marks.add(456);
				modelAndView.addObject("marksList", marks);
				
				modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @RequestMapping("/about") public String about() {
	 * System.out.println("this is about page");
	 * 
	 * return "about"; }
	 * 
	 * 
	 * @RequestMapping("/help") public ModelAndView help() { //************** Using
	 * ModelAndView ******************************* ModelAndView modelAndView=new
	 * ModelAndView();
	 * 
	 * modelAndView.addObject("name","Ahsan Shareef");
	 * 
	 * //*********************** To Get Date&Time
	 * *************************************
	 * 
	 * LocalDateTime dateTime=LocalDateTime.now(); modelAndView.addObject("dtAndTm",
	 * dateTime);
	 * 
	 * modelAndView.addObject("rollNumber",7027);
	 * 
	 * List<Integer> marks=new ArrayList<Integer>(); marks.add(872); marks.add(345);
	 * marks.add(456); modelAndView.addObject("marksList", marks);
	 * 
	 * modelAndView.setViewName("help");
	 * 
	 * return modelAndView; }
	 */
}
 
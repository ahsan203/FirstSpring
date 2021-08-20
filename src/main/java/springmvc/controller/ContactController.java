package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

/*import springmvc.model.User;
import springmvc.service.UserService;*/

@Controller
public class ContactController 
{
	@Autowired
	//private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm(Model model)
	{
			
		model.addAttribute("header", "Registration Form");
		model.addAttribute("description","Home for Programmer");
		
		return"contact";
	}
	
	
	
	  @RequestMapping(path="/processform",method=RequestMethod.POST)
	 public String contactForm(@ModelAttribute User user) 
	 {
		  System.out.println(user);
	 
	 /* if(user.getUsername().isBlank())
	  {
	  
	  return "redirect:/contact"; 
	  
	  }
	  
	  
	  this.userService.createUser(user);  */
	  
	  return "success"; 
	 
	 }
	 
	
	/*
	 * @RequestMapping(path="/processForm",method=RequestMethod.POST)
	 *  public String  contactForm(@RequestParam("email") String email,
	 *							   @RequestParam("username") String name,
	 *                             @RequestParam("password") String password, Model model)
	 *                             
	 * {
	 * 
	 * model.addAttribute("email", email); 
	 * model.addAttribute("name", name);
	 * model.addAttribute("passowrd",password);
	 * 
	 * return "success";
	 * 
	 *  }
	 */


}

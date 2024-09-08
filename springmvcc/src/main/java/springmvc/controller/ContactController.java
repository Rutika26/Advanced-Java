package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
//When @ModelAttribute at method level then it will called first before other request method called 
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header","Learn Code with Rutika");
		m.addAttribute("desc","This is practice project");
		System.out.println("Adding common data");
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}
	/*
// ******Using @RequestParam annotation***********
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("userEmail") String email, 
			@RequestParam("userName") String name,
			@RequestParam("userPassword") String password, 
			Model model) {

		model.addAttribute("email", email);
		model.addAttribute("name", name);
		model.addAttribute("password", password);		

		return "success";
	}
	*/
	
	
/*
	// ********getter setter of User class **********
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("userEmail") String email, 
			@RequestParam("userName") String name,
			@RequestParam("userPassword") String password, 
			Model model) {

		User user = new User();
		user.setUserEmail(email);
		user.setUserName(name);
		user.setUserPassword(password);
		System.out.println(user);
		
		model.addAttribute("user",user);

		return "success";
	}
*/
	
//		********@ModelAttribute annotation **********
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
	
		System.out.println(user);
		
		//redirection in mvc
		if(user.getUserName().isBlank())
			return "redirect:/contact";
		
		int createdUser=this.userService.createUser(user);
		model.addAttribute("msg","User created with id " +createdUser);
		return "success";
	}
}

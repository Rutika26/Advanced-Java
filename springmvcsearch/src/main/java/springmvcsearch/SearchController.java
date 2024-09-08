package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	// To bing method parameter to URI template variable
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println(userId);
		System.out.println(userName);
		//NullPointerException
		Integer.parseInt(userName);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		
		System.out.println("Going to home view..");
		
		String str=null;
		System.out.println(str.length());
		
		
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		if(query.isBlank()) {
			System.out.println("Please fill the fields");
			return new RedirectView("home");
		}
			
		String url ="http://www.google.com/search?q="+query;
		RedirectView rv=new RedirectView();
		rv.setUrl(url);
		return rv;
	}
	
//	//handling exception in our spring mvc
////	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
//	// OR
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		
//		m.addAttribute("msg","NullPointerException occurred");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(NumberFormatException.class)
//	public String exceptionHandlerNumberFormat(Model m) {
//		m.addAttribute("msg","NumberFormatException occurred");
//		return "null_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(Exception.class)
//	public String exceptionHandlerGeneric(Model m) {
//		m.addAttribute("msg","Exception occurred");
//		return "null_page";
//	}
}

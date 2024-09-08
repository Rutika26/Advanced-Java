package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//used for centralized exception handling
@ControllerAdvice
public class MyExceptionHandler {

	// centralized exception handling in our spring mvc
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	// OR
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		
		m.addAttribute("msg","NullPointerException occurred");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("msg","NumberFormatException occurred");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public String exceptionHandlerGeneric(Model m) {
		m.addAttribute("msg","Exception occurred");
		return "null_page";
	}
}

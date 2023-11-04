package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String userDetail(@PathVariable("userId") int id,@PathVariable("userName") String name) {
		System.out.println(id);
		System.out.println(name);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Homw view");
//		String s=null;
//		System.out.println(s.length());
		
		return "home";
	}
	@RequestMapping("/search")
	public RedirectView serach(@RequestParam("queryBox") String query) {
		RedirectView rd=new RedirectView();
		String url="https://www.google.com/search?q="+query;
		rd.setUrl(url);
		return rd;
	}
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandler() {
//		return "null_page";
//	}
	

}

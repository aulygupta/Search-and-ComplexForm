package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@RequestMapping("/complex")
	public String showForm() {
		return "complex";
	}
//	@RequestMapping(path = "/handleform" , method = RequestMethod.POST)
//	public String formHandle(@RequestParam("email") String emailid,
//			                 @RequestParam("exampleFormControlSelect1") String continent,
//			                 @RequestParam("exampleFormControlSelect2") String num,
//			                 @RequestParam("desc") String description) {
//		System.out.println(emailid);
//		System.out.println(continent);
//		System.out.println(num);
//		System.out.println(description);
//		
//		return "success";
//	}
	@RequestMapping(path = "/handleform" , method = RequestMethod.POST)
	public String formHandle(@ModelAttribute("person") Person person,BindingResult res) {
		if(res.hasErrors()) {
			return "complex";
		}
		System.out.println(person);
		
		return "success";
	}

}

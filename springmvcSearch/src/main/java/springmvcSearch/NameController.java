package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NameController {
	@RequestMapping("/name")
	public String enterName() {
		 return "name";
	}
	@RequestMapping(path = "/submit", method = RequestMethod.POST)
	public String submitname(@RequestParam("firstname") String fname,
			                 @RequestParam("lastname") String lname,Model m) {
		//System.out.println("hi");
		m.addAttribute("fname",fname);
		m.addAttribute("lname",lname);
		
		
		return "welcome";
		
	}

}

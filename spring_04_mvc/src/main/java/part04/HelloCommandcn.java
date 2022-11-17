package part04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloCommandcn {
	
	
	@RequestMapping(value= "/mem.htm",method = RequestMethod.GET)
	public String form() {
		return "part04/memfrom";
	}
	
	/*
	 * @RequestMapping(value= "/mem.htm", method = RequestMethod.POST) public
	 * ModelAndView submit(String name, int age, ModelAndView mav) {
	 * mav.addObject("name", name); mav.addObject("age", age);
	 * mav.setViewName("part04/memPro"); return mav; }
	 */
	
	@PostMapping("/mem.htm")
	public String submit(MemDTO dat) {
		return "part04/memPro";
	}
}

package part04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloCommandcn {
	
	
	@RequestMapping(value= "/mem.htm")
	public String form() {
		return "part04/memfrom";
	}
}

package part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellocontorller {
	public Hellocontorller() {
		
	}
	
	
	@RequestMapping(value="/hello.htm")
	public String search() {
		return "part01/hello";
	}
}

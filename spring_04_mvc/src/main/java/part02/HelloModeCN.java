package part02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloModeCN {

	@RequestMapping("/part02/helloModel.htm")
	public Model search(Model model) {
		model.addAttribute("id", "korea");
		return model;
	}
}

package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/form")
	public String renderForm(){
		return "form";
	}

	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
}

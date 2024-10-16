package shop.samdul.greeting.controller; //경로에 있을떈 패키지를 써주게 되어있음 

import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.samdul.greeting.model.People;

@Controller
public class GreetingController {

	private Stack<People> nameStack = new Stack<>(); //people 객체 저장, 스택은 LIFO구조로 가장 나중에 추가된 객체 먼저 처리
  
  @GetMapping("/greeting")	
  public String greeting(@RequestParam(name="name", required=false, defaultValue="HI") String name, Model model) {
		People p = new People();
		if (!nameStack.isEmpty()) {
			People pp = nameStack.peek();
			p.setNum(pp.getNum() + 1);
		} else {
				p.setNum(1);
		}
		p.setName(name.toLowerCase());
		nameStack.push(p);
		model.addAttribute("nameStack", nameStack);
		
		return "greeting";
  }
}
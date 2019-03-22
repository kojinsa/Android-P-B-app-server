package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.UserService;
import vo.User;

@Controller
public class IndexController {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
	public String index() {
		System.out.println("main 가져오기 성공");
		return "main";
	}// index end

	@RequestMapping(value = "/ajax/main", method = RequestMethod.GET)
	@ResponseBody
	public List<User> ajaxMain() {
		System.out.println("json list 성공");
		return userService.selectList();
	}//ajaxMain end

}// IndexController end

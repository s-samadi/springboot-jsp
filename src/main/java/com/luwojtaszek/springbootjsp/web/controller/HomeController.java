package com.luwojtaszek.springbootjsp.web.controller;

import com.luwojtaszek.springbootjsp.web.constant.View;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by lukasz on 27.08.2017.
 * With IntelliJ IDEA 15
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("message", "Spring Boot application that uses JSP With Embedded Tomcat");
        return View.HOME.getPath();
    }
    
    
    // http --form POST http://localhost:8090/login emailAddress="test@gmail.com" password="password1" token="reflected"
    @RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam final String emailAddress, @RequestParam final String password, final Model model,
			            @RequestParam final String token) {
      model.addAttribute("message", "happy birthday");
      model.addAttribute("token", token); // tainted
      return "welcome";
    }

}

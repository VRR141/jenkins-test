package org.vrr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HelloWorldController {


    private String forTest = "test jenkins 2";

    @RequestMapping("/hello")
    public String helloController(Model model){
        String hi = "Hello world!";
        String info = System.getProperty("os.name");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.u");
        String time = LocalDateTime.now().format(dtf);
        model.addAttribute("forTest", forTest);
        model.addAttribute("hello", hi);
        model.addAttribute("info", info);
        model.addAttribute("time", time);
        return "hello";
    }
}

package com.shubhgupta.jobportal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/home" )
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Index";
    }
}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        return "index";
    }

    @RequestMapping("/corejava1")
    public String corejava1() {
        return "corejava1";
    }
    @RequestMapping("/corejava2")
    public String corejava2() {
        return "corejava2";
    }

    @RequestMapping("/github1")
    public String github1() {
        return "github1";
    }
    @RequestMapping("/github2")
    public String github2() {
        return "github2";
    }
    @RequestMapping("/program1")
    public String program1() {
        return "program1";
    }
    @RequestMapping("/program2")
    public String program2() {
        return "program2";
    }
}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homepage() {
        return "index";
    }
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
    @RequestMapping("/bootcamp")
    public String bootcamp() {
        return "bootcamp";
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
}

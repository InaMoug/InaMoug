package com.practice.bookshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //is like the main method to start running

public class GreetingController {

    @GetMapping("/greeting") //kaloume thn methodo gia na mporesei na treksei to programma
    public String greetingForm( Model model) {
        model.addAttribute ("greeting",new Greeting());
        return "greeting"; //epistrefei to apotelesmal
    }
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute("greeting") Greeting greeting) {
        return "result";
    }
}

package com.wran.Controller;

import com.wran.Model.Sentence;
import com.wran.Service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
public class HomeController {

    @Autowired
    SentenceService sentenceService;

    @GetMapping("/")
    public String showHome(Model model){
        model.addAttribute("sentence", new Sentence());
        return "index";
    }

    @PostMapping("/saySomething")
    public String saySomething(@ModelAttribute("sentence") Sentence sentence){
        if( !(sentence.getName().equals("") && sentence.getText().equals("")) )
            sentenceService.save(sentence);
        return "redirect:/";
    }
}

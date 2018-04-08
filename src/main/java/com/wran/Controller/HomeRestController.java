package com.wran.Controller;

import com.wran.Model.Sentence;
import com.wran.Service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeRestController {

    @Autowired
    SentenceService sentenceService;

    @GetMapping("/getSentences")
    public List<Sentence> getAllSentences(){
        return sentenceService.getAllSentences();
    }

}

package com.wran.Service;

import com.wran.Model.Sentence;
import com.wran.Repository.SentenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sentenceService")
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    SentenceRepository sentenceRepository;

    public List<Sentence> getAllSentences() {
        return sentenceRepository.findAll();
    }

    @Override
    public Sentence save(Sentence sentence) {
        return sentenceRepository.save(sentence);
    }
}

package com.wran.Service;

import com.wran.Model.Sentence;

import java.util.List;

public interface SentenceService {
    List<Sentence> getAllSentences();
    Sentence save(Sentence sentence);
}

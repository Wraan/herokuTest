package com.wran.Repository;

import com.wran.Model.Sentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SentenceRepository extends JpaRepository<Sentence, Long> {

    @Query("Select s from Sentence s order by s.id desc")
    List<Sentence> findAll();
}

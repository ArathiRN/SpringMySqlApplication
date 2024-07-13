package com.arathin.springmysql.repository;

import com.arathin.springmysql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer>{
// Tutorial → Entity type and Long --> primary key

    //   findByPublished is a custom method()
    List<Tutorial> findByPublished(Boolean Published);
}

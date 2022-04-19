package com.project.springboot;

import com.project.springboot.entity.NewsPaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsPaperRepository extends JpaRepository<NewsPaper,Long> {
}

package com.hungpham.repository;

import com.hungpham.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<NewsEntity,String> {
    List<NewsEntity> getByAuthor(String author);
}

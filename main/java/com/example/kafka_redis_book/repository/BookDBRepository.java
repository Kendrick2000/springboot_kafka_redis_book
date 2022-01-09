package com.example.kafka_redis_book.repository;

import com.example.kafka_redis_book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDBRepository extends JpaRepository<Book, Long> {
}

package com.example.Ex1.repositories;

import com.example.Ex1.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livros, Long> {
}

package com.example.Ex1.services;

import com.example.Ex1.entity.Livros;
import com.example.Ex1.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public Livros create(Livros livro){
        return repository.save(livro);
    }

    public List<Livros> listar(){
        return repository.findAll();
    }

    public Optional<Livros> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}

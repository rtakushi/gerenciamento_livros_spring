package com.example.Ex1.controllers;


import com.example.Ex1.entity.Livros;
import com.example.Ex1.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @PostMapping
    public Livros criar(@RequestBody Livros livro) {
        return service.create(livro);
    }

    @GetMapping
    public List<Livros> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Livros> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}

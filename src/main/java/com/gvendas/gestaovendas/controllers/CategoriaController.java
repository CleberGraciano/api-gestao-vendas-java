package com.gvendas.gestaovendas.controllers;

import com.gvendas.gestaovendas.entities.Categoria;
import com.gvendas.gestaovendas.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("categories")
public class CategoriaController {

    private CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria salvarCategoria(@RequestBody Categoria categoria){
        return categoriaService.salvar(categoria);
    }

    @GetMapping
    public List<Categoria> listarTodasCategorias(){
        return categoriaService.buscarCategorias();
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Categoria>> buscarCategoriaPorId(@PathVariable long id){
        Optional<Categoria> categoria = categoriaService.buscarCategoriaPorId(id);
        return categoria.isPresent() ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
    }
}

package com.gvendas.gestaovendas.services;

import com.gvendas.gestaovendas.entities.Categoria;
import com.gvendas.gestaovendas.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> buscarCategorias(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> buscarCategoriaPorId(long id){
        return categoriaRepository.findById(id);
     }

    public Categoria salvar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}

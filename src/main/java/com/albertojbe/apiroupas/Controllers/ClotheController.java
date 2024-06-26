package com.albertojbe.apiroupas.Controllers;

import com.albertojbe.apiroupas.Models.Clothe;
import com.albertojbe.apiroupas.Services.ClotheServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clothe")
public class ClotheController {

    @Autowired
    ClotheServices services;

    @GetMapping(value = "")
    public List<Clothe> findAll(){
        return services.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Clothe> findById(@PathVariable(value = "id") Long id){
        return services.findById(id);
    }
    @PostMapping
    public ResponseEntity<String> addClothe(@RequestBody Clothe clothe){
        return services.create(clothe);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteClothe(@PathVariable(value = "id") Long id){
        return services.delete(id);
    }
}

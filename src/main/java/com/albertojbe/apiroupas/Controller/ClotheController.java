package com.albertojbe.apiroupas.Controller;

import com.albertojbe.apiroupas.Model.Clothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;
import com.albertojbe.apiroupas.Service.ClotheServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clothe")
public class ClotheController {

    private final ClotheServices services;

    public ClotheController(ClotheServices services) {
        this.services = services;
    }

    @GetMapping(value = "")
    public List<ClotheDTO> findAll(){
        return services.findAll();
    }

    @GetMapping("/{id}")
    public ClotheDTO findById(@PathVariable(value = "id") Long id){
        return services.findById(id);
    }

    @PostMapping
    public ResponseEntity<String> addClothe(@RequestBody Clothe clothe){
        return services.create(clothe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClotheDTO> updateClothe(@RequestBody ClotheDTO clotheDTO, @PathVariable Long id){
        return services.update(clotheDTO, id);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteClothe(@PathVariable(value = "id") Long id){
        return services.delete(id);
    }
}

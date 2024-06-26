package com.albertojbe.apiroupas.Services;

import com.albertojbe.apiroupas.Models.Clothe;
import com.albertojbe.apiroupas.Repository.ClotheRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClotheServices {

    @Autowired
    ClotheRepository repo;

    public List<Clothe> findAll(){
        return repo.findAll();
    }

    public Optional<Clothe> findById(Long id){
        return repo.findById(id);
    }

    public ResponseEntity<String> create(Clothe clothe){
        repo.save(clothe);
        return ResponseEntity.ok("Clothes created");
    }

    public ResponseEntity<String> delete(Long id){
        var entity = repo.findById(id);
        entity.ifPresent(clothe -> repo.delete(clothe));
        return ResponseEntity.ok("Clothes deleted");
    }
}

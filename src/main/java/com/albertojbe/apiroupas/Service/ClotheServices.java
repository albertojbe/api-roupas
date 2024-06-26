package com.albertojbe.apiroupas.Service;

import com.albertojbe.apiroupas.Exceptions.ResourceNotFoundResponse;
import com.albertojbe.apiroupas.Util.Mapper;
import com.albertojbe.apiroupas.Model.Clothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;
import com.albertojbe.apiroupas.Repository.ClotheRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class ClotheServices {

    private final ClotheRepository repo;

    public ClotheServices(ClotheRepository repo) {
        this.repo = repo;
    }

    public List<ClotheDTO> findAll(){
        return Mapper.parseObject(repo.findAll(), ClotheDTO.class);
    }

    public ClotheDTO findById(Long id){
        var entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundResponse("Clothe with this ID not found"));
        return Mapper.parseObject(entity, ClotheDTO.class);
    }

    public ResponseEntity<String> create(Clothe clotheDTO){
        var entity = Mapper.parseObject(clotheDTO, Clothe.class);
        repo.save(entity);
        return new ResponseEntity<>("Clothes created", HttpStatus.CREATED);
    }

    public ResponseEntity<ClotheDTO> update(ClotheDTO clotheDTO, Long id){
        Clothe entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundResponse("Clothe with this ID not found"));
        Mapper.updateClothe(clotheDTO, entity);
        repo.save(entity);
        return new ResponseEntity<>(Mapper.parseObject(entity, ClotheDTO.class), HttpStatus.CREATED);
    }

    public ResponseEntity<String> delete(Long id){
        var entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundResponse("Clothe with this ID not found"));
        repo.delete(entity);
        return new ResponseEntity<>("Clothes deleted", HttpStatus.NO_CONTENT);
    }


}

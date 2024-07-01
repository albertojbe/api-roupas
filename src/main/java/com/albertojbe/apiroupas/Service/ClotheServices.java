package com.albertojbe.apiroupas.Service;

import com.albertojbe.apiroupas.Controller.ClotheController;
import com.albertojbe.apiroupas.Exceptions.ResourceNotFoundResponse;
import com.albertojbe.apiroupas.Util.DozerMapper;
import com.albertojbe.apiroupas.Model.Clothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;
import com.albertojbe.apiroupas.Repository.ClotheRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
@Transactional
public class ClotheServices {

    private final ClotheRepository repo;

    public ClotheServices(ClotheRepository repo) {
        this.repo = repo;
    }

    public List<ClotheDTO> findAll() throws ResourceNotFoundResponse{
        List<ClotheDTO> listDto = DozerMapper.parseListObjects(repo.findAll(), ClotheDTO.class);
        if (listDto.isEmpty()){
            throw new ResourceNotFoundResponse("No clothes found");
        }
        else{
            for (ClotheDTO dto : listDto){
                long key = dto.getKey();
                dto.add(linkTo(methodOn(ClotheController.class).findById(key)).withSelfRel());
            }
            return listDto;
        }
    }

    public ClotheDTO findById(Long id){
        var entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundResponse("Clothe with this ID not found"));
        ClotheDTO dto = DozerMapper.parseObject(entity, ClotheDTO.class);
        dto.add(linkTo(methodOn(ClotheController.class).findAll()).withSelfRel());
        return dto;
    }

    public ResponseEntity<ClotheDTO> create(ClotheDTO clotheDTO){
        var entity = DozerMapper.parseObject(clotheDTO, Clothe.class);
        ClotheDTO dto = DozerMapper.parseObject(repo.save(entity), ClotheDTO.class);
        dto.add(linkTo(methodOn(ClotheController.class).findAll()).withSelfRel());
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    public ResponseEntity<ClotheDTO> update(ClotheDTO clotheDTO, Long id){
        Clothe entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundResponse("Clothe with this ID not found"));
        DozerMapper.updateClothe(clotheDTO, entity);
        ClotheDTO dto = DozerMapper.parseObject(repo.save(entity), ClotheDTO.class);
        dto.add(linkTo(methodOn(ClotheController.class).findAll()).withSelfRel());
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    public ResponseEntity<String> delete(Long id){
        var entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundResponse("Clothe with this ID not found"));
        repo.delete(entity);
        return new ResponseEntity<>("Clothe deleted", HttpStatus.NO_CONTENT);
    }


}

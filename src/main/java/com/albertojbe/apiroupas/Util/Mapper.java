package com.albertojbe.apiroupas.Util;

import com.albertojbe.apiroupas.Model.Clothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;
import com.github.dozermapper.core.DozerBeanMapperBuilder;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    private static com.github.dozermapper.core.Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O, D> D parseObject(O origin , Class<D> destination) {
        return mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseObject(List<O> origin , Class<D> destination) {
        List<D> destinationObjects = new ArrayList<>();
        for (O o : origin){
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }

    public static void updateClothe(ClotheDTO clotheDTO, Clothe clothe) {
        clothe.setType(clotheDTO.getType());
        clothe.setBrand(clotheDTO.getBrand());
        clothe.setSize(clotheDTO.getSize());
        clothe.setQuantity(clotheDTO.getQuantity());
        clothe.setPrice(clotheDTO.getPrice());
    }

}

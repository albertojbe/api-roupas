package com.albertojbe.apiroupas.Mock;

import com.albertojbe.apiroupas.Model.Clothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;

import java.util.ArrayList;
import java.util.List;


public class MockClothe {

    public static final String TYPE = "Camisa";
    public static final String BRAND = "Nike";
    public static final String SIZE = "G";
    public static final String PRICE = "50,00";
    public static final String QUANTITY = "50";

    public Clothe mockClothe(){
        return mockClothe(0);
    }

    public ClotheDTO mockClotheDTO(){
        return mockClotheDTO(0);
    }

    public Clothe mockClothe(Integer id){
        return new Clothe(id.longValue(), TYPE, BRAND, SIZE, PRICE, QUANTITY);
    }

    public ClotheDTO mockClotheDTO(Integer id){
        return new ClotheDTO(id.longValue(), TYPE, BRAND, SIZE, PRICE, QUANTITY);
    }

    public List<Clothe> mockClotheList(){
        List<Clothe> listClothes = new ArrayList<Clothe>();
        for(int i = 0; i<10; i++){
            Integer id = i;
            listClothes.add(mockClothe(id));
        }
        return listClothes;
    }

    public List<ClotheDTO> mockClotheDTOList(){
        List<ClotheDTO> listClothesDTO = new ArrayList<ClotheDTO>();
        for(int i = 0; i<10; i++){
            Integer id = i;
            listClothesDTO.add(mockClotheDTO(id));
        }
        return listClothesDTO;
    }
}

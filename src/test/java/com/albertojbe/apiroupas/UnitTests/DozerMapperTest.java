package com.albertojbe.apiroupas.UnitTests;

import com.albertojbe.apiroupas.Mock.MockClothe;
import com.albertojbe.apiroupas.Model.Clothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;
import com.albertojbe.apiroupas.Util.DozerMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DozerMapperTest {

    MockClothe input;

    @BeforeEach
    void setUp() {
        input = new MockClothe();
    }

    @Test
    void testEntityToDTO() {
        var output = DozerMapper.parseObject(input.mockClothe(), ClotheDTO.class);
        assertEquals(0L, output.getKey());
        assertEquals(MockClothe.TYPE, output.getType());
        assertEquals(MockClothe.BRAND, output.getBrand());
        assertEquals(MockClothe.PRICE, output.getPrice());
        assertEquals(MockClothe.SIZE, output.getSize());
        assertEquals(MockClothe.QUANTITY, output.getQuantity());
    }

    @Test
    void testDTOToEntity() {
        var output = DozerMapper.parseObject(input.mockClotheDTO(), Clothe.class);
        assertEquals(0L, output.getId());
        assertEquals(MockClothe.TYPE, output.getType());
        assertEquals(MockClothe.BRAND, output.getBrand());
        assertEquals(MockClothe.PRICE, output.getPrice());
        assertEquals(MockClothe.SIZE, output.getSize());
        assertEquals(MockClothe.QUANTITY, output.getQuantity());
    }

    @Test
    void TestListEntityToListDTO() {
        var output = DozerMapper.parseListObjects(input.mockClotheList(), ClotheDTO.class);
        for(int i = 0; i<10; i++){
            ClotheDTO outputList = output.get(i);
            assertEquals(i, outputList.getKey());
            assertEquals(MockClothe.TYPE, outputList.getType());
            assertEquals(MockClothe.BRAND, outputList.getBrand());
            assertEquals(MockClothe.PRICE, outputList.getPrice());
            assertEquals(MockClothe.SIZE, outputList.getSize());
            assertEquals(MockClothe.QUANTITY, outputList.getQuantity());
        }
    }

    @Test
    void TestListDTOToListEntity() {
        var output = DozerMapper.parseListObjects(input.mockClotheDTOList(), Clothe.class);
        for(int i = 0; i<10; i++){
            Clothe outputList = output.get(i);
            assertEquals(i, outputList.getId());
            assertEquals(MockClothe.TYPE, outputList.getType());
            assertEquals(MockClothe.BRAND, outputList.getBrand());
            assertEquals(MockClothe.PRICE, outputList.getPrice());
            assertEquals(MockClothe.SIZE, outputList.getSize());
            assertEquals(MockClothe.QUANTITY, outputList.getQuantity());
        }
    }
}

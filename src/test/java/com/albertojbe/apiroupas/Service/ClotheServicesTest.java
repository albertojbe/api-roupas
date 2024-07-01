package com.albertojbe.apiroupas.Service;

import com.albertojbe.apiroupas.Mock.MockClothe;
import com.albertojbe.apiroupas.Model.Clothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;
import com.albertojbe.apiroupas.Repository.ClotheRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ClotheServicesTest {

    MockClothe input;

    @InjectMocks
    private ClotheServices clotheServices;

    @Mock
    ClotheRepository repo;

    @BeforeEach
    void setUpMock(){
        MockitoAnnotations.openMocks(this);
        input = new MockClothe();
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
        when(repo.findById(anyLong())).thenReturn(Optional.of(input.mockClothe()));

        ClotheDTO actual = clotheServices.findById(1L);

        assertNotNull(actual    );
        assertNotNull(actual.getLinks());
        assertEquals(0L, actual.getKey());
        assertEquals(MockClothe.TYPE, actual.getType());
        assertEquals(MockClothe.BRAND, actual.getBrand());
        assertEquals(MockClothe.PRICE, actual.getPrice());
        assertEquals(MockClothe.SIZE, actual.getSize());
        assertEquals(MockClothe.QUANTITY, actual.getQuantity());
    }

    @Test
    void create() {
        when(repo.save(any(Clothe.class))).thenReturn(input.mockClothe());

        var actual = clotheServices.create(input.mockClotheDTO());

        assertNotNull(actual);
    }

    @Test
    void update() {

    }

    @Test
    void delete() {
    }
}
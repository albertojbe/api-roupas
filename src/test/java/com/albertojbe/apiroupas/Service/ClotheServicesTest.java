package com.albertojbe.apiroupas.Service;

import com.albertojbe.apiroupas.Mock.MockClothe;
import com.albertojbe.apiroupas.Model.DTOs.ClotheDTO;
import com.albertojbe.apiroupas.Repository.ClotheRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ClotheServicesTest {

    MockClothe input;

    @InjectMocks
    private ClotheServices services;

    @Mock
    private ClotheRepository repo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        input = new MockClothe();
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {

    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

}
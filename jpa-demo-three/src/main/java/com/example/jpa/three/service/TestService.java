package com.example.jpa.three.service;


import com.example.jpa.three.repository.domain.DataList;

public interface TestService {
    DataList getOne(Long id);
}

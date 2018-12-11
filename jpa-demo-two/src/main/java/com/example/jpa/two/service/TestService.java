package com.example.jpa.two.service;

import com.example.jpa.two.repository.domain.DataList;

public interface TestService {
    DataList getOne(Long id);
}

package com.example.jpa.one.service;

import com.example.jpa.one.repository.domain.DataList;

public interface TestService {
    DataList getOne(Long id);
}

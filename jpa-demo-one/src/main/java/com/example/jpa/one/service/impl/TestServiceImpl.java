package com.example.jpa.one.service.impl;

import com.example.jpa.one.repository.DataListRepository;
import com.example.jpa.one.repository.domain.DataList;
import com.example.jpa.one.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private DataListRepository dataListRepository;

    public DataList getOne(Long id){

        //方法一
//        DataList dataList=new DataList();
//        Example<DataList> dataListExample=Example.of(dataList);
//        Optional<DataList> dataListOptional=dataListRepository.findOne(dataListExample);

        //方法二
        DataList dataList=dataListRepository.getOne(id);
        return dataList;
    }
}

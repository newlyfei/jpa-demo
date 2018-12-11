package com.example.jpa.two.service.impl;

import com.example.jpa.two.repository.DataListRepository;
import com.example.jpa.two.repository.domain.DataList;
import com.example.jpa.two.service.TestService;
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

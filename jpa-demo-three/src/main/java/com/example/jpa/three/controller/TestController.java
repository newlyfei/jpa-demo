package com.example.jpa.three.controller;

import com.example.jpa.three.repository.domain.DataList;
import com.example.jpa.three.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DataList test(){
        DataList dataList=testService.getOne(1l);
        System.out.println(dataList.getUsername());
        return dataList;
    }
}

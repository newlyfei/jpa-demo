package com.example.jpa.two.repository;

import com.example.jpa.two.repository.domain.DataList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataListRepository extends JpaRepository<DataList,Long> {
}

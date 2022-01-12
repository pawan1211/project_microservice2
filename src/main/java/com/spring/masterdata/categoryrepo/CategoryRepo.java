package com.spring.masterdata.categoryrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.masterdata.entity.CategoryEntity;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, Long>{

}

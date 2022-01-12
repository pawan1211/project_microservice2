package com.spring.masterdata.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.masterdata.categoryrepo.CategoryRepo;
import com.spring.masterdata.dto.CategoryDto;
import com.spring.masterdata.entity.CategoryEntity;
import com.spring.masterdata.exception.InvalidCategoryIdException;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Override
	public List<CategoryDto> getAllCategories() {
		List<CategoryEntity> categoryEntities = categoryRepo.findAll();
		List<CategoryDto> categories = new ArrayList<>();
		categoryEntities.stream().forEach((categoryEntity)->categories.add(new CategoryDto(categoryEntity.getId(), categoryEntity.getName(), categoryEntity.getDescription())));
		return categories;
	}

	@Override
	public CategoryDto getCategoryById(long categoryId) {
		Optional<CategoryEntity> opCategoryEntity = categoryRepo.findById(categoryId);
		if(opCategoryEntity.isPresent()) {
			CategoryEntity categoryEntity = opCategoryEntity.get();
			return new CategoryDto(categoryEntity.getId(), categoryEntity.getName(), categoryEntity.getDescription());
		}
		throw new InvalidCategoryIdException("Invalid id"+categoryId);
	}

}

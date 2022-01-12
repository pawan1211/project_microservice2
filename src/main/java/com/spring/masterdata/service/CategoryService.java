package com.spring.masterdata.service;

import java.util.List;

import com.spring.masterdata.dto.CategoryDto;

public interface CategoryService {
	public List<CategoryDto> getAllCategories();
	public CategoryDto getCategoryById(long categoryId);
}

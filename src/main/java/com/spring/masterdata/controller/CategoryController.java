package com.spring.masterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.masterdata.dto.CategoryDto;
import com.spring.masterdata.service.CategoryService;

@RestController

public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value="/category")
	public List<CategoryDto> getAllCategories() {
		return categoryService.getAllCategories();
	}

	@GetMapping(value="/category/{id}")
	public CategoryDto getCategoryById(@PathVariable("id") long Id) {
		return categoryService.getCategoryById(Id);
	}
}
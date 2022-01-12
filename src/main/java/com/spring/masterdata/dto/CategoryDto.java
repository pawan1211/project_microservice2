package com.spring.masterdata.dto;

public class CategoryDto {

	

		private long id;
		private String description;
		private String name;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	
		public CategoryDto(long id, String name, String description) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
		}
		
	}


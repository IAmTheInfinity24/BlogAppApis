package com.infinity.blogAppApis.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

	private Long categoryId;
	@NotBlank
	@Size(min = 5)
	private String categoryTitle;
	@NotBlank
	@Size(min = 5)
	private String categoryDescription;
	
	
}

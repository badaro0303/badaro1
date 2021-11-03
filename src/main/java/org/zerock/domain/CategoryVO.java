package org.zerock.domain;

import lombok.Data;

@Data
public class CategoryVO {
	private int tier;
	private String cateName;
	private String cateCode;
	private String cateCodeRef;
}

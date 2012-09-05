package ch.itraum.thymeleaf.model;

import java.util.Date;

import javax.validation.constraints.Future;

import org.hibernate.validator.constraints.NotEmpty;

public class FormBean {
	
	@NotEmpty
	private String name;
	
	@Future
	private Date date;
	
	private Integer number;
	
	private Boolean checkbox;
	
	private Category category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Boolean getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(Boolean checkbox) {
		this.checkbox = checkbox;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "FormBean [name=" + name + ", date=" + date + ", number="
				+ number + ", checkbox=" + checkbox + ", category=" + category
				+ "]";
	}
}

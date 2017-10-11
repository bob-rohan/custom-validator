package rohan.validator.web.model;

import javax.validation.constraints.Min;

public class Candidate {

	@Min(16)
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}

package ch.itraum.thymeleaf.model;

//import java.util.Date;

//import javax.validation.constraints.Future;

import org.hibernate.validator.constraints.NotEmpty;

public class TestFormBean
{
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
	private String[] optionsCB;
	
	private String optionR;
	
	private Boolean remember;
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public Boolean getRemember()
	{
		return remember;
	}
	
	public void setRemember(Boolean status)
	{
		this.remember = status;
	}
	
	public String[] getOptionsCB()
	{
		return optionsCB;
	}
	
	public void setOptionsCB(String[] options)
	{
		this.optionsCB = options;
	}
	
	public String getOptionR()
	{
		return optionR;
	}
	
	public void setOptionR(String option)
	{
		this.optionR = option;
	}
	
	@Override
	public String toString()
	{
		return "TestFormBean [email=" + email + "]";
	}
}

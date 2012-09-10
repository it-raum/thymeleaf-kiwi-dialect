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
		String text = "";
		
		text += "*** TestFormBean ***\n";
		text += "Email:\t\t" + email + "\n";
		text += "Password:\t" + password + "\n";
		text += "Radio:\t\t" + optionR + "\n";
		
		if(this.optionsCB.length == 0)
		{
			text += "Check Box:\tEmpty\n";
		}
		else
		{
			text += "Check Box:\n";
			
			for(int i = 0;i < this.optionsCB.length;i++)
				text += "\t[" + i + "]:\t" + this.optionsCB[i] + "\n";
		}
		
		text += "***************\n";
		
		return text;
	}
	
	public String getInfo()
	{
		String html = "";
		
		html += "TestFormBean [";
		html += "Email: '" + this.email + "' | ";
		html += "Password: '" + this.password + "' | ";
		html += "Radio: '" + this.optionR + "' | ";
		
		if(this.optionsCB == null || this.optionsCB.length == 0)
		{
			html += "Check Box: Empty";
		}
		else
		{
			html += "Check Box: ";
			
			for(int i = 0;i < this.optionsCB.length;i++)
				html += "'" + this.optionsCB[i] + "', ";
		}
		
		html += "]";
		
		return html;
	}
}

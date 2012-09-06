package ch.itraum.thymeleaf;

import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public abstract class FormFieldValidatedAbstractProcessor extends FormFieldAbstractProcessor
{
	public FormFieldValidatedAbstractProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}
	
	public FormFieldValidatedAbstractProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	protected static String getErrorHTML(String fieldName)
	{
		return getErrorHTML("help-inline",fieldName);
	}
	
	protected static String getErrorHTML(String classCSS,String fieldName)
	{
		String html = "";
		
		html += "<span class=\"" + classCSS + "\" ";
		html += "th:if=\"${#fields.hasErrors('" + fieldName + "')}\" ";
		html += "th:each=\"err : ${#fields.errors('" + fieldName + "')}\" th:text=\"${err}\">";
		html += "Please correct the error</span>\n";
		
		return html;
	}
}

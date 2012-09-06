package ch.itraum.thymeleaf;

import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public abstract class FormFieldValidatedInputProcessor extends FormFieldValidatedAbstractProcessor
{
	public FormFieldValidatedInputProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}
	
	public FormFieldValidatedInputProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	protected static String getHTML(String fieldType,String dataField,String labelTitle,String fieldID,String placeholder)
	{
		return getHTML(fieldType,dataField,labelTitle,fieldID,placeholder,"help-inline","controls","control-group","control-label");
	}
	
	protected static String getHTML(String fieldType,String dataField,String labelTitle,String fieldID,String placeholder,String classCSSError)
	{
		return getHTML(fieldType,dataField,labelTitle,fieldID,placeholder,classCSSError,"controls","control-group","control-label");
	}
	
	protected static String getHTML(String fieldType,String dataField,String labelTitle,String fieldID,String placeholder,String classCSSError,String classCSSDiv,String classCSSDivGroup,String classCSSLabel)
	{
		String html = "";
		
		html += "<div class=\"" + classCSSDivGroup + "\" ";
		html += "th:class=\"${#fields.hasErrors('" + dataField + "')} ? ";
		html += "'" + classCSSDivGroup + " error' : '" + classCSSDivGroup + "'\">\n";
		html += "<label class=\"" + classCSSLabel + "\" for=\"" + fieldID + "\">" + labelTitle + "</label>\n";
		html += "<div class=\"" + classCSSDiv + "\">\n";
		html += "<input type=\"" + fieldType + "\" id=\"" + fieldID + "\" placeholder=\"" + placeholder + "\" th:field=\"*{" + dataField + "}\" />\n";
		html += getErrorHTML(classCSSError,dataField);
		html += "</div>\n";
		html += "</div>\n";
		
		return html;
	}
}

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
	
	protected static String getHTML(String dataField,String fieldType,String fieldID,String placeholder,String labelTitle)
	{
		return getHTML("controls","control-group","control-label","help-inline",dataField,fieldType,fieldID,placeholder,labelTitle);
	}
	
	protected static String getHTML(String classCSSError,String dataField,String fieldType,String fieldID,String placeholder,String labelTitle)
	{
		return getHTML("controls","control-group","control-label",classCSSError,dataField,fieldType,fieldID,placeholder,labelTitle);
	}
	
	protected static String getHTML(String classCSSDiv,String classCSSDivGroup,String classCSSLabel,String classCSSError,String dataField,String fieldType,String fieldID,String placeholder,String labelTitle)
	{
		String html = "";
		
		html += "<div class=\"" + classCSSDivGroup + "\" ";
		html += "th:class=\"${#fields.hasErrors('" + dataField + "')} ? ";
		html += "'" + classCSSDivGroup + " error' : '" + classCSSDivGroup + "'\">\n";
		html += "<label class=\"" + classCSSLabel + "\" for=\"" + fieldID + "\">" + labelTitle + "</label>\n";
		html += "<div class=\"" + classCSSDiv + "\">\n";
		html += "<input type=\"" + fieldType + "\" id=\"" + fieldID + "\" placeholder=\"" + placeholder + "\" th:field=\"*{" + dataField + "}\"/>\n";
		html += getErrorHTML(classCSSError,dataField);
		html += "</div>\n";
		html += "</div>\n";
		
		return html;
	}
}

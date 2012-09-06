package ch.itraum.thymeleaf;

import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public abstract class FormFieldInputProcessor extends FormFieldAbstractProcessor
{
	public FormFieldInputProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}

	public FormFieldInputProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	protected static String getHTML(String fieldType,String dataField,String labelTitle,String fieldID,String placeholder)
	{
		return getHTML(fieldType,dataField,labelTitle,fieldID,placeholder,"controls","control-group","control-label");
	}
	
	protected static String getHTML(String fieldType,String dataField,String labelTitle,String fieldID,String placeholder,String classCSSDiv,String classCSSDivGroup,String classCSSLabel)
	{
		String html = "";
		
		html += "<div class=\"" + classCSSDivGroup + "\">\n";
		html += "<label class=\"" + classCSSLabel + "\" for=\"" + fieldID + "\">" + labelTitle + "</label>\n";
		html += "<div class=\"" + classCSSDiv + "\">\n";
		html += "<input type=\"" + fieldType + "\" id=\"" + fieldID + "\" placeholder=\"" + placeholder + "\" th:field=\"*{" + dataField + "}\" />\n";
		html += "</div>\n";
		html += "</div>\n";
		
		return html;
	}
}

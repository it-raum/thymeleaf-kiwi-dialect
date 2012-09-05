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
	
	protected static String getHTML(String fieldType,String fieldID,String placeholder,String labelTitle)
	{
		return getHTML("controls","control-group","control-label",fieldType,fieldID,placeholder,labelTitle);
	}
	
	protected static String getHTML(String classCSSDiv,String classCSSDivGroup,String classCSSLabel,String fieldType,String fieldID,String placeholder,String labelTitle)
	{
		String html = "";
		
		html += "<div class=\"" + classCSSDivGroup + "\">\n";
		html += "<label class=\"" + classCSSLabel + "\" for=\"" + fieldID + "\">" + labelTitle + "</label>\n";
		html += "<div class=\"" + classCSSDiv + "\">\n";
		html += "<input type=\"" + fieldType + "\" id=\"" + fieldID + "\" placeholder=\"" + placeholder + "\" />\n";
		html += "</div>\n";
		html += "</div>\n";
		
		return html;
	}
}

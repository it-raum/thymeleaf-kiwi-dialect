package ch.itraum.thymeleaf;

import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public abstract class FormFieldSelectProcessor extends FormFieldAbstractProcessor
{
	public FormFieldSelectProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}
	
	public FormFieldSelectProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	protected static String getHTML(String classCSSLabel,String fieldType,String fieldID,String fieldName,String fieldValue,String fieldText)
	{
		return getHTML("controls","control-group",classCSSLabel,fieldType,fieldID,fieldName,fieldValue,fieldText);
	}
	
	protected static String getHTML(String classCSSDiv,String classCSSDivGroup,String classCSSLabel,String fieldType,String fieldID,String fieldName,String fieldValue,String fieldText)
	{
		String html = "";
		
		html += "<div class=\"" + classCSSDivGroup + "\">\n";
		html += "<div class=\"" + classCSSDiv + "\">\n";
		html += "<label class=\"" + classCSSLabel + "\">\n";
		html += "<input type=\"" + fieldType + "\" id=\"" + fieldID + "\" name=\"" + fieldName + "\" value=\"" + fieldValue + "\" />" + fieldText + "\n";
		html += "</label>\n";
		html += "</div>\n";
		html += "</div>\n";
		
		return html;
	}
}

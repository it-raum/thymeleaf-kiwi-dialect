package ch.itraum.thymeleaf;

import org.thymeleaf.processor.IAttributeNameProcessorMatcher;
import org.thymeleaf.processor.attr.AbstractUnescapedTextChildModifierAttrProcessor;

public abstract class FormFieldAbstractProcessor extends AbstractUnescapedTextChildModifierAttrProcessor
{
	public FormFieldAbstractProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}
	
	public FormFieldAbstractProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	public int getPrecedence()
	{
		return 11000;
	}
	
	protected static String getHTML(String fieldType,String fieldID,String placeholder,String labelTitle)
	{
		String html = "";
		
		html += "<div class=\"control-group\">\n";
		html += "<label class=\"control-label\" for=\"" + fieldID + "\">" + labelTitle + "</label>\n";
		html += "<div class=\"controls\">\n";
		html += "<input type=\"" + fieldType + "\" id=\"" + fieldID + "\" placeholder=\"" + placeholder + "\" />\n";
		html += "</div>\n";
		html += "</div>\n";
		
		return html;
	}
}

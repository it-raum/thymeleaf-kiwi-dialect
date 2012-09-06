package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldButtonProcessor extends FormFieldAbstractProcessor
{
	public FormFieldButtonProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}

	public FormFieldButtonProcessor(String attributeName)
	{
		super(attributeName);
	}

	public FormFieldButtonProcessor()
	{
		super("formFieldButton");
	}
	
	protected String getText(Arguments arguments,Element element,String attributeName)
	{
		String[] values = element.getAttributeValue(attributeName).trim().split(",");
		
		String text = "";
		
		text += "<div class=\"control-group\">\n";
		text += "<div class=\"controls\">\n";
		
		switch(values.length)
		{
		case 1:
			text += getSingleSubmitButton(values[0]);
			
			break;
			
		case 2:
			text += getSubmitButton(values[0]);
			text += getCancelButton(values[1]);
			
			break;
			
		default:
			return "";
		}
		
		text += "</div>\n";
		text += "</div>\n";
		
		return text;
	}
	
	private static String getSingleSubmitButton(String buttonText)
	{
		return FormHTML.getSubmitButton("btn",buttonText);
	}
	
	private static String getSubmitButton(String buttonText)
	{
		return FormHTML.getSubmitButton("btn btn-primary",buttonText);
	}
	
	private static String getCancelButton(String buttonText)
	{
		return FormHTML.getCancelButton("btn",buttonText);
	}
}

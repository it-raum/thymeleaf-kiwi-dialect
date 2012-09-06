package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldPasswordProcessor extends FormFieldInputProcessor
{
	public FormFieldPasswordProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}
	
	public FormFieldPasswordProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	public FormFieldPasswordProcessor()
	{
		super("formFieldPassword");
	}
	
	protected String getText(Arguments arguments,Element element,String attributeName)
	{
		String[] values = element.getAttributeValue(attributeName).trim().split(",");
		
		String text = "";
		
		switch(values.length)
		{
		case 4:
			text = super.getHTML("password",values[0],values[1],values[2],values[3]);
			break;
			
		case 7:
			text = super.getHTML("password",values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
			break;
			
		default:
			text = "";
		}
		
		return text;
	}
}

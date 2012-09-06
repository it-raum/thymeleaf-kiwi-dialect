package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldTextProcessor extends FormFieldInputProcessor
{
	public FormFieldTextProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}
	
	public FormFieldTextProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	public FormFieldTextProcessor()
	{
		super("formFieldText");
	}
	
	protected String getText(Arguments arguments,Element element,String attributeName)
	{
		String[] values = element.getAttributeValue(attributeName).trim().split(",");
		
		String text = "";
		
		switch(values.length)
		{
		case 4:
			text = super.getHTML("text",values[0],values[1],values[2],values[3]);
			break;
			
		case 7:
			text = super.getHTML("text",values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
			break;
			
		default:
			text = "";
		}
		
		return text;
	}
}

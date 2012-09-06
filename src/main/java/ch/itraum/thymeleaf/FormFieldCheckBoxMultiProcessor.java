package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldCheckBoxMultiProcessor extends FormFieldSelectProcessor
{
	public FormFieldCheckBoxMultiProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}

	public FormFieldCheckBoxMultiProcessor(String attributeName)
	{
		super(attributeName);
	}

	public FormFieldCheckBoxMultiProcessor()
	{
		super("formFieldCheckBoxMulti");
	}
	
	protected String getText(Arguments arguments,Element element,String attributeName)
	{
		String[] values = element.getAttributeValue(attributeName).trim().split(",");
		
		String text = "";
		
		switch(values.length)
		{
		case 3:
			text = super.getHTMLMulti("checkbox",values[0],values[1],values[2],"control-label");
			break;
			
		case 4:
			text = super.getHTMLMulti("checkbox",values[0],values[1],values[2],values[3]);
			break;
			
		default:
			text = "";
		}
		
		return text;
	}
}

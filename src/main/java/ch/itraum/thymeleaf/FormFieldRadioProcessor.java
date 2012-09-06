package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldRadioProcessor extends FormFieldSelectProcessor
{
	public FormFieldRadioProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}

	public FormFieldRadioProcessor(String attributeName)
	{
		super(attributeName);
	}

	public FormFieldRadioProcessor()
	{
		super("formFieldRadio");
	}
	
	protected String getText(Arguments arguments,Element element,String attributeName)
	{
		String[] values = element.getAttributeValue(attributeName).trim().split(",");
		
		String text = "";
		
		switch(values.length)
		{
		case 2:
			text = super.getHTMLMulti("radio",values[0],values[1],"control-label");
			break;
			
		case 3:
			text = super.getHTMLMulti("radio",values[0],values[1],values[2]);
			break;
			
		default:
			text = "";
		}
		
		return text;
	}
}

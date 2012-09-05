package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldPasswordProcessor extends FormFieldAbstractProcessor
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
		
		if(values.length != 3)
			return "";
		
		return super.getHTML("password",values[0],values[1],values[2]);
	}
}

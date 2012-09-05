package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldTextProcessor extends FormFieldAbstractProcessor
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
		
		if(values.length != 3)
			return "";
		
		return super.getHTML("text",values[0],values[1],values[2]);
	}
}

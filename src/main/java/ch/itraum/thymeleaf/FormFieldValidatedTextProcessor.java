package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldValidatedTextProcessor extends FormFieldValidatedInputProcessor
{
	public FormFieldValidatedTextProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}

	public FormFieldValidatedTextProcessor(String attributeName)
	{
		super(attributeName);
	}

	public FormFieldValidatedTextProcessor()
	{
		super("formFieldValidatedText");
	}
	
	protected String getText(Arguments arguments,Element element,String attributeName)
	{
		String[] values = element.getAttributeValue(attributeName).trim().split(",");
		
		String text = "";
		
		switch(values.length)
		{
		case 4:
			text = super.getHTML(values[0],"text",values[1],values[2],values[3]);
			break;
			
		case 5:
			text = super.getHTML(values[0],"text",values[1],values[2],values[3],values[4]);
			break;
			
		case 8:
			text = super.getHTML(values[0],"text",values[1],values[2],values[3],values[4],values[5],values[6],values[7]);
			break;
			
		default:
			text = "";
		}
		
		return text;
	}
}

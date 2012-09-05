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
}

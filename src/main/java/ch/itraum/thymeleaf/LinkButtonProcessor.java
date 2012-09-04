package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.attr.AbstractTextChildModifierAttrProcessor;

public class LinkButtonProcessor extends AbstractTextChildModifierAttrProcessor {

	public LinkButtonProcessor() {
		super("linkButton");
	}
	
	@Override
	public int getPrecedence() {
		return 11000;
	}
	
	@Override
	protected String getText(Arguments arguments, Element element, String attributeName) {		
		return "Link to: <a href=\"" + element.getAttributeValue(attributeName) + "\">Bla</a>";
	}

}

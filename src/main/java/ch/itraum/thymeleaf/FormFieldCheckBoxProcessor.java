package ch.itraum.thymeleaf;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public class FormFieldCheckBoxProcessor extends FormFieldSelectProcessor
{
	public FormFieldCheckBoxProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}

	public FormFieldCheckBoxProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	public FormFieldCheckBoxProcessor()
	{
		super("formFieldCheckBox");
	}
	
	protected String getText(Arguments arguments,Element element,String attributeName)
	{
		String[] values = element.getAttributeValue(attributeName).trim().split(",");
		
		String text = "";
		
		switch(values.length)
		{
		case 3:
			text = getHTML(values[0],values[1],values[2],"control-label");
			break;
			
		case 4:
			text = getHTML(values[0],values[1],values[2],values[3]);
			break;
			
		case 5:
			text = getHTML(values[0],values[1],values[2],values[3],values[4]);
			break;
			
		default:
			text = "";
		}
		
		return text;
	}
	
	private static String getHTML(String dataField,String labelTitle,String fieldID,String classCSSLabel)
	{
		return getHTML(dataField,labelTitle,fieldID,classCSSLabel,"controls");
	}
	
	private static String getHTML(String dataField,String labelTitle,String fieldID,String classCSSLabel,String classCSSDiv)
	{
		String html = "";
		
		html += "<div class=\"" + classCSSDiv + "\">\n";
		html += "<label for=\"" + fieldID + "\">" + labelTitle + "</label>\n";
		html += "<input type=\"checkbox\"  id=\"" + fieldID + "\" th:field=\"*{" + dataField + "}\" />\n";
		html += "</div>\n";
		
		return html;
	}
}

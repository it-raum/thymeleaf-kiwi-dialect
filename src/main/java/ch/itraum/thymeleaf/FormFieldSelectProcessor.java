package ch.itraum.thymeleaf;

import org.thymeleaf.processor.IAttributeNameProcessorMatcher;

public abstract class FormFieldSelectProcessor extends FormFieldAbstractProcessor
{
	public FormFieldSelectProcessor(IAttributeNameProcessorMatcher matcher)
	{
		super(matcher);
	}
	
	public FormFieldSelectProcessor(String attributeName)
	{
		super(attributeName);
	}
	
	protected static String getHTMLMulti(String fieldType,String containerName,String iteratorName,String classCSSLabel)
	{
		String html = "";
		
		html += "<ul>\n";
		html += "<li th:each=\"" + iteratorName + " : ${" + containerName + "}\">\n";
		html += "<input type=\"" + fieldType + "\" th:value=\"${" + iteratorName + "}\" th:text=\"${" + iteratorName + "}\" />\n";
		html += "<label th:text=\"${" + iteratorName + "}\">Label</label>\n";
		html += "</li>\n";
		html += "</ul>\n";
		
		return html;
	}
}

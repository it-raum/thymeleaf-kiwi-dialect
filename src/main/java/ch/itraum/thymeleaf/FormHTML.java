package ch.itraum.thymeleaf;

public final class FormHTML
{
	public static String getSubmitButton(String buttonClass,String buttonText)
	{
		return getButton("submit",buttonClass,buttonText);
	}
	
	public static String getCancelButton(String buttonClass,String buttonText)
	{
		return getButton("button",buttonClass,buttonText);
	}
	
	private static String getButton(String buttonType,String buttonClass,String buttonText)
	{
		return "<button type=\"" + buttonType + "\" class=\"" + buttonClass + "\">" + buttonText + "</button>\n";
	}
}

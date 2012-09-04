package ch.itraum.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

public class KiwiDialect extends AbstractDialect {

	@Override
	public String getPrefix() {
		return "kiwi";
	}

	@Override
	public boolean isLenient() {
		return false;
	}

	@Override
	public Set<IProcessor> getProcessors() {
		final Set<IProcessor> processors = new HashSet<IProcessor>();
		processors.add(new LinkButtonProcessor());
		return processors;
	}

}

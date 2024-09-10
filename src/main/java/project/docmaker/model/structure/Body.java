package project.docmaker.model.structure;

import project.docmaker.model.DocumentationTagList;
import project.docmaker.model.structure.section.Section;
import project.docmaker.utility.annotation.NoLogger;

import java.text.MessageFormat;

/**
 * The record {@code Body} represents the body of one instance of {@link Section}
 *
 * @param description       The {@link Description} instance of the abstract section instance
 * @param documentationTags The {@link DocumentationTagList} instance of the abstract section instance
 * @param snippet           The header {@link Snippet} of the abstract section instance
 *
 * @author Lasse-Leander Hillen
 * @since 2024-09-07
 */
@NoLogger
public record Body(Description description, DocumentationTagList documentationTags, Snippet snippet)
{

	/**
	 * {@link MessageFormat} pattern, which is used, when the {@link Body#toString()} method gets called
	 */
	private static final String TEXT_DISPLAY_PATTERN = Body.class.getSimpleName() + "[description={0}, documentationTags={1}, codeSnippet={2}]";



	/**
	 * Generates and returns a formatted {@link String} which represents the instance in its current state.
	 *
	 * @return A formatted {@link String} which represents the object in its current state.
	 */
	@Override
	public String toString ()
	{
		return MessageFormat.format(TEXT_DISPLAY_PATTERN, this.description, this.documentationTags, this.snippet);
	}
}

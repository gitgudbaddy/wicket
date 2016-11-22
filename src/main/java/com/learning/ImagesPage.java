/**
 * 
 */
package com.learning;

//import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.learning.panels.FooterPanel;

/**
 * @author Mark
 *
 */
public class ImagesPage extends BasePage {

	public static final String CONTENT_ID = "contentComponent";

	private static final long serialVersionUID = 1L;

	public ImagesPage(final PageParameters parameters) {
		super(parameters);

		replace(new FooterPanel(CONTENT_ID));
	}
}

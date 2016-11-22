package com.learning;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		
		add(new Label("helloMessage", "Hello Wicket World!"));
		
		add(new Link("imagesLink") {
			@Override
			public void onClick() {
				setResponsePage(ImagesPage.class);
			}
		});
    }
}

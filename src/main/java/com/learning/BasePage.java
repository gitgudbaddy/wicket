package com.learning;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.learning.panels.FooterPanel;

public class BasePage extends WebPage {

	private static final String CONTENT_ID = "contentComponent";

	private static final long serialVersionUID = 1L;

	public BasePage(final PageParameters parameters) {

		add(new HeaderPanel("basePageHeaderPanel"));
		add(new Label(CONTENT_ID, "Put your content here!"));
		add(new FooterPanel("basePageFooterPanel"));
	}
}

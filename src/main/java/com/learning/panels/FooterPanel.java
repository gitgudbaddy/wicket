package com.learning.panels;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

public class FooterPanel extends Panel {

	private static final long serialVersionUID = 1L;
	
	public FooterPanel(String id) {
		super(id);
		
		add(new Label("footerPanelLabel", "This is the footer panel!"));
	}
}

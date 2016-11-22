/**
 * 
 */
package com.learning;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * @author Mark
 *
 */
public class HeaderPanel extends Panel {

	private static final long serialVersionUID = 1L;
	
	//links
	public final String START_PAGE_LINK 	= "startPageLink";
	public final String IMAGES_PAGE_LINK 	= "imagesPageLink";
	public final String LOGIN_PAGE_LINK		= "loginPageLink";
	
	
		public HeaderPanel (String id) {
			super(id);
			
			add(new Link(START_PAGE_LINK) {				
				@Override
				public void onClick() {
					setResponsePage(StartPage.class);
				}
			});
			
			add(new Link(IMAGES_PAGE_LINK) {				
				@Override
				public void onClick() {
					setResponsePage(ImagesPage.class);
				}
			});
			
			add(new Link(LOGIN_PAGE_LINK) {				
				@Override
				public void onClick() {
					setResponsePage(LoginPage.class);
				}
			});
		}
		
		//TODO: add getters and setters for page name label
}

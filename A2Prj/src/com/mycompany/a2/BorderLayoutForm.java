package com.mycompany.a2;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;

public class BorderLayoutForm extends Form{
	
	public BorderLayoutForm() {
		
		this.setLayout(new BorderLayout());
		
		Label northLabel = new Label("This is the north");
		
		this.add(BorderLayout.NORTH,northLabel);
	}
}

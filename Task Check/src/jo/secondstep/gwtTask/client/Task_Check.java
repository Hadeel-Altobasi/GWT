package jo.secondstep.gwtTask.client;

import jo.secondstep.gwtTask.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Task_Check implements EntryPoint {


	public void onModuleLoad() {
		
			 
			 String[] langueges= {"C++","C", "JAVA", "PAYTHON", "C#" ,"ASP.NET"};
		 
		  final TextBox box = new TextBox();
		  box.setStyleName("box");
		  box.setText("The Langueges you know : ");
				  VerticalPanel panel = new VerticalPanel();
				 
			 for (int i=0 ; i<langueges.length;i++)
		     {
		    	
				final CheckBox checkBox=new CheckBox();
		    	  checkBox.setText(langueges[i]);
		    	  checkBox.addStyleName("check");

		    	 panel.add(checkBox);
		    	 checkBox.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						if(checkBox.isChecked())
						{				box.setText(box.getText()+" "+checkBox.getText()+" , ");
					}
						else 
						{
							String str=checkBox.getText();
							StringBuilder builder=new StringBuilder(box.getText());
							int index=builder.indexOf(str);
							builder.delete(index, index+str.length()+2);
							box.setText(builder.toString());
						
						}
						}
				});
		    	
		    	 //checkBox.addClickHandler(this);
		     }
			 box.setPixelSize(400,90);
			 panel.add(box);
			 RootPanel.get().add(panel);
		    
		 }
	
}

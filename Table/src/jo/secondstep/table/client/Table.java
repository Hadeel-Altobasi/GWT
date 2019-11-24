package jo.secondstep.table.client;

import jo.secondstep.table.shared.FieldVerifier;

import javax.swing.ImageIcon;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Table implements EntryPoint {
	
	public void onModuleLoad() {
		final FlexTable flexTable = new FlexTable();
		 VerticalPanel panel = new VerticalPanel();
	    FlexCellFormatter cellFormatter = flexTable.getFlexCellFormatter();
	    cellFormatter.addStyleName(0,1,"cell");
	    flexTable.addStyleName("Table");
	    flexTable.setWidth("32em");
	    flexTable.setCellSpacing(5);
	    flexTable.setCellPadding(3);
	    cellFormatter.setHorizontalAlignment(0, 0, HasAlignment.ALIGN_LEFT);
	    flexTable.setHTML(0, 0, "Click what you need :");
	    cellFormatter.setColSpan(0, 0, 3);
	    Button addBtn = new Button("Add Row", new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				addRow(flexTable);
				
			}
		});
	     Button remBtn = new Button("Remove" , new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				remRow(flexTable);
			}
		});
	     addBtn.setStyleName("add");
	     remBtn.setStyleName("rem");
		 panel.add(flexTable);
		 panel.add(addBtn);
		 panel.add(remBtn);
		 RootPanel.get().add(panel);
	}
	private void  addRow (FlexTable flexTable)
	{
		
		 int numRows = flexTable.getRowCount();
		    flexTable.setWidget(numRows, 0, new Image("https://www.bing.com/images/search?view=detailV2&ccid=SBKfRXWA&id=7ED0A8D84077EC6BCD99A95972FD55E8AC136187&thid=OIP.SBKfRXWACJdhuqPXU67_dQHaFj&mediaurl=https%3a%2f%2fwww.bpc.bw%2fmedia-site%2fnews%2fPublishingImages%2fknowledge_development_box.png&exph=600&expw=800&q=images+box&simid=608055763635538501&selectedIndex=3"));
		    flexTable.setWidget(numRows, 1, new Image("https://www.bing.com/images/search?view=detailV2&ccid=SBKfRXWA&id=7ED0A8D84077EC6BCD99A95972FD55E8AC136187&thid=OIP.SBKfRXWACJdhuqPXU67_dQHaFj&mediaurl=https%3a%2f%2fwww.bpc.bw%2fmedia-site%2fnews%2fPublishingImages%2fknowledge_development_box.png&exph=600&expw=800&q=images+box&simid=608055763635538501&selectedIndex=3"));
		    flexTable.setWidget(numRows,2, new Image("https://www.bing.com/images/search?view=detailV2&ccid=SBKfRXWA&id=7ED0A8D84077EC6BCD99A95972FD55E8AC136187&thid=OIP.SBKfRXWACJdhuqPXU67_dQHaFj&mediaurl=https%3a%2f%2fwww.bpc.bw%2fmedia-site%2fnews%2fPublishingImages%2fknowledge_development_box.png&exph=600&expw=800&q=images+box&simid=608055763635538501&selectedIndex=3"));
		    flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows);
	}
	private void  remRow (FlexTable flexTable)
	{
		int numRows = flexTable.getRowCount();
	    if (numRows > 1) {
	      flexTable.removeRow(numRows - 1);
	      flexTable.getFlexCellFormatter().setRowSpan(0, 1, numRows - 1);
	}
	}
}

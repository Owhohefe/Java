import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.RootPaneContainer;

public class MouseDetailsFrame extends JFrame{
	private JPanel mousePanel;
	private JLabel statusBar;
	private String details;
	
	public MouseDetailsFrame(){
		super("Mouse clicks and buttons");
		getContentPane().setBackground(Color.BLACK);
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.YELLOW);
		add(mousePanel,BorderLayout.CENTER);
		
		statusBar = new JLabel("Click the mouse");
		statusBar.setForeground(Color.WHITE);
		add(statusBar,BorderLayout.SOUTH);
		
		MouseClickHandler handler = new MouseClickHandler();
		mousePanel.addMouseListener(handler);
	}
	
	private class MouseClickHandler extends MouseAdapter{
		
		public void mouseEntered(MouseEvent event){
			mousePanel.setBackground(Color.GREEN);
		}
		
		public void mouseExited(MouseEvent event){
			mousePanel.setBackground(Color.YELLOW);
		}
		
		public void mouseClicked(MouseEvent event){
			details = String.format("Clicked %d times", event.getClickCount());
			
			if (event.isMetaDown()){
				details += " with right mouse button";
			}else if(event.isAltDown()){
				details += " with mouse wheel";	
			}else{
				details += " with left mouse button";
			}
			
			statusBar.setText(details);
		}
	}

}

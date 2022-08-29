import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class MouseTrackerFrame extends JFrame{
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public MouseTrackerFrame(){
		super("Demonstrating Mouse Events");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel,BorderLayout.CENTER);
		
		statusBar = new JLabel("Mouse outside JPanel");
		add(statusBar,BorderLayout.SOUTH);
		
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
		
	}
	
	private class MouseHandler implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent event) {
			statusBar.setText(String.format("Mouse Dragged at [%d, %d]", event.getX(),event.getY()));
			
		}

		@Override
		public void mouseMoved(MouseEvent event) {
			statusBar.setText(String.format("Mouse Moved at [%d, %d]",event.getX(),event.getY()));
			
		}

		@Override
		public void mouseClicked(MouseEvent event) {
			statusBar.setText(String.format("Mouse clicked at [%d, %d]",event.getX(),event.getY()));
			
		}

		@Override
		public void mouseEntered(MouseEvent event) {
			statusBar.setText(String.format("Mouse Entered at [%d, %d]",event.getX(),event.getY()));
			mousePanel.setBackground(Color.GREEN);
		}

		@Override
		public void mouseExited(MouseEvent event) {
			statusBar.setText(String.format("Mouse Exited at [%d, %d]",event.getX(),event.getY()));
			mousePanel.setBackground(Color.WHITE);
			
		}

		@Override
		public void mousePressed(MouseEvent event) {
			statusBar.setText(String.format("Mouse Pressed at [%d, %d]",event.getX(),event.getY()));
			
		}

		@Override
		public void mouseReleased(MouseEvent event) {
			statusBar.setText(String.format("Mouse Released at [%d, %d]",event.getX(),event.getY()));
			
		}
		
	}

}

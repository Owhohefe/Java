import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutFrame extends JFrame{

	private JButton button[];
	private static final String names[]={"one", "two", "three", "four", "five", "six"};
	private boolean toggle = true;
	private Container container;
	private GridLayout gridLayout1;
	private GridLayout gridLayout2;

	public GridLayoutFrame(){
		super("GridLayout Demo");
		
		gridLayout1 = new GridLayout(2,3,5,5);
		gridLayout2 = new GridLayout(3,2);
		container = getContentPane();
		setLayout(gridLayout1);
		
		button = new JButton[names.length];
		
		ButtonHandler handler = new ButtonHandler();
		
		for (int count=0; count < names.length; count++){
			button[count] = new JButton(names[count]);
			button[count].addActionListener(handler);
			add(button[count]);
		}
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(toggle){
				container.setLayout(gridLayout2);
			}else{
				container.setLayout(gridLayout1);
			}
			
			toggle = !toggle;
			container.validate();			
		}
		
	}
}

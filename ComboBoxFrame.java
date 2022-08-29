import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame {
	private JLabel label;
	private JComboBox imagesJComboBox;
	
	String [] names = {"bug_insect.png","add_bug.png","ladybird.png","insect.png"};
	Icon [] icons = {
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3]))
	};
	
	public ComboBoxFrame (){
		super("Testing JComboBox");
		setLayout(new FlowLayout());
		
		imagesJComboBox = new JComboBox(names);
		imagesJComboBox.setMaximumRowCount(3);
		add(imagesJComboBox);
		
		label = new JLabel(icons[0]);
		add(label);
		
		imagesJComboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange()==ItemEvent.SELECTED){
					label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
				}
				
			}
		});
	}

}

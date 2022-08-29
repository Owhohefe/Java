
import java.awt.*;

public class GUIAWT extends Frame{
	
	public void newButton(){
		Frame frame = new Frame();
		Button Obj = new Button("Click me");
		Obj.setBounds(120,150,150,50);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.add(Obj);
	}

	public static void main(String[] args) {
		GUIAWT newObj = new GUIAWT();
		
		newObj.newButton();
		
	}

}

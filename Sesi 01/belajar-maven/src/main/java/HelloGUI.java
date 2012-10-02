import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.*;

public class HelloGUI {
	private JLabel lhello;

	public HelloGUI(){
	JLabel lhello= new JLabel("Hello World");
	JFrame frame = new JFrame();
	Container containt=frame.getContentPane();
	containt.setLayout(new BorderLayout());

	containt.add(lhello);

	frame.setTitle("Hello world");
	frame.setVisible(true);
	frame.setSize(500,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		HelloGUI helloGUI= new HelloGUI();
	}
}
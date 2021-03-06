import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;
    
    public Window3() {
	this.setTitle("Temperature Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("toC");
	b.addActionListener(this);
	b.setActionCommand("toC");
	JButton b2 = new JButton("toF");
	b2.addActionListener(this);
	b2.setActionCommand("toF");


	t = new JTextField(10);

	JCheckBox c = new JCheckBox("OverClock");
	j = new JLabel("the temperature is:");
	pane.add(c);
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
    }
    public static double CtoF(double t){
	return 1.8*t+32;
    }
    public static double FtoC(double t){
	return (t-32)/1.8;
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("toC")){
	    String s=t.getText();
	    double x=Double.parseDouble(s);
	    j.setText(FtoC(x));
	}
	if(event.equals("toF")){
	    String r=t.getText();
	    double y=Double.parseDouble(s);
	    j.setText(CtoF(y));
	}
    }



}

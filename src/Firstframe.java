import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Firstframe extends JFrame implements ActionListener{
	JButton start,ext;
	JTextField tf1;
	Firstframe(){
		this.setBounds(200,100,600,500);
		this.setTitle("Java Mini Project");
		this.getContentPane().setBackground(Color.CYAN);
		this.setVisible(true);
		setLayout(null);
		

		ImageIcon logo= new ImageIcon("logo.jpg");
		this.setIconImage(logo.getImage());
		
		JLabel l1=new JLabel("Nikhil's Number Game -");
		l1.setBounds(75,30,400,30);
		l1.setFont(new Font("Verdana",Font.ITALIC,30));
		l1.setForeground(Color.RED);
		this.add(l1);
		
		JLabel l2= new JLabel("Enter Your Name -");
		l2.setBounds(75,100,350,30);
		l2.setFont(new Font("Verdana",Font.ITALIC,20));
		l2.setForeground(Color.MAGENTA);
		this.add(l2);
		
		tf1= new JTextField();
		tf1.setBounds(275,100,200,30);
		tf1.setBackground(Color.yellow);
		tf1.setFont(new Font("Verdana",Font.ITALIC,20));
		this.add(tf1);
		
		start=new JButton("Start");
		start.setBounds(150,170,75,30);
		start.setBackground(Color.BLUE);
		start.setForeground(Color.white);
		start.setFont(new Font("Verdana",Font.ITALIC,15));
		start.addActionListener(this);
		this.add(start);
		
		ext=new JButton("exit");
		ext.setBounds(250,170,75,30);
		ext.setBackground(Color.red);
		ext.setForeground(Color.white);
		ext.setFont(new Font("Verdana",Font.ITALIC,15));
		ext.addActionListener(this);
		this.add(ext);
		
		JLabel rules = new JLabel();
		rules.setBounds(50,200,500,300);
		rules.setText("<html>"
				+ "1. RULES - " + "<br><br>" +
			     "1. YOU NEED TO GUESS THE NUMBER CORRECTLY" + "<br><br>" +
				 "2. GUESS AS FAST AS POSSIBLE" + "<br><br>" +
				 "3. WITH EVERY WRONG GUESS SCORE REDUCES BY 5" + "<br><br>" +
				 "4. THERE WILL BE HINT AFTER EVERY GUESS" + "<br><br>" +
				 "5. THE RANGE OF NUMBER IS FROM 1 - 100" + "<br><br>" +
				  "ALL THE BEST !" +
				"</html>");
		rules.setForeground(Color.blue);
		this.add(rules);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==start) {
			String name=tf1.getText();
//			System.out.println(name);
			new GameFrame(name);
			this.setVisible(false);
		}else if(ae.getSource()==ext){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Firstframe();

	}

}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
public class GameFrame extends JFrame implements ActionListener{
	JTextField choice;
	JButton enter;
	int score=100;
	long number= ThreadLocalRandom
            .current()
            .nextInt(0, 100 + 1);
	
//	System.out.println(number);
	GameFrame(String name){
		this.setBounds(100,100,700,500);
		this.setLayout(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.cyan);
		
		JLabel l1= new JLabel(name + " welcome to the game");
		l1.setBounds(70,50,600,35);
		l1.setFont(new Font("Verdana", Font.PLAIN, 30));
		l1.setForeground(Color.red);
		this.add(l1);
		
		JLabel l2= new JLabel("Enter your number");
		l2.setBounds(75,120,500,30);
		l2.setFont(new Font("Verdana", Font.PLAIN, 20));
		l2.setForeground(Color.magenta);
		this.add(l2);
		
		enter= new JButton("Enter");
		enter.setBounds(500,120,100,30);
		enter.setFont(new Font("Verdana", Font.PLAIN, 20));
		enter.setBackground(Color.blue);
		enter.setForeground(Color.white);
		enter.addActionListener(this);
		this.add(enter);
		
		choice=new JTextField();
		choice.setBounds(350,120,120,30);
		choice.setFont(new Font("Verdana", Font.PLAIN, 20));
		choice.setBackground(Color.yellow);
		this.add(choice);

		ImageIcon logo= new ImageIcon("logo.jpg");
		this.setIconImage(logo.getImage());
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==enter) {
//			repaint();
			int num=Integer.parseInt(choice.getText());
			if(num==number) {
				repaint();
//				JOptionPane.showMessageDialog(this,"Congratulations, you have won the game !"); 
				JLabel sc = new JLabel("congratulations Your Score is  " + score);
				sc.setBounds(75,170,600,30);
				sc.setFont(new Font("Verdana", Font.ITALIC, 25));
				sc.setForeground(Color.BLUE);
				this.add(sc);
				JLabel last = new JLabel("Thank you for playing the game :-)");
				last.setBounds(100,230,500,40);
				last.setFont(new Font("Verdana", Font.ITALIC, 25));
				last.setForeground(Color.red);
				this.add(last);
				JRadioButton r1=new JRadioButton("5 stars");
				r1.setBounds(100,300,200,30);
				r1.setBackground(Color.orange);
				JRadioButton r2=new JRadioButton("4 stars");
				r2.setBounds(100,330,200,30);
				r2.setBackground(Color.orange);
				JRadioButton r3=new JRadioButton("3 stars");
				r3.setBounds(100,360,200,30);
				r3.setBackground(Color.orange);
				JRadioButton r4=new JRadioButton("2 stars");
				r4.setBounds(100,390,200,30);
				r4.setBackground(Color.orange);
				JRadioButton r5=new JRadioButton("1 stars");
				r5.setBounds(100,420,200,30);
				r5.setBackground(Color.orange);
				ButtonGroup bg=new ButtonGroup();
				bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);bg.add(r5);
				this.add(r1);this.add(r2);this.add(r3);this.add(r4);this.add(r5);
			}else if(num>number) {
				JOptionPane.showMessageDialog(this,"Please enter a lower number"); 
				score-=5;
				repaint();
				
			}else if(num<number) {
				JOptionPane.showMessageDialog(this,"Please enter a higher number");  
				score-=5;
				repaint();
			}else {
				JOptionPane.showMessageDialog(this,"Please enter a valid number");  
				score-=5;
			}
		}
	}
	public static void main(String args[]) {
		new GameFrame("");
		
	}
}

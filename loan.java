package foood;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.awt.event.ActionEvent;
public class loan {
	private JFrame frame;
	private JTextField txtenter;
	private JTextField txtyear;
	private JTextField txtloan;
	private JTextField txtpay;
	private static JTextField txtTotal;
	private JButton btnExit;
	private JButton btnReset;
	private JButton btnRecipt; 
	private JButton btnLoan;
	
	protected java.text.SimpleDateFormat SimpleDateFormat;
	static String k3,k2,k1,k;
	static int refs;


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loan window = new loan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void w()
{
try {
	FileWriter myWrite = new FileWriter("C:\\Users\\User\\Desktop\\Recp.txt", true);   
	PrintWriter p = new PrintWriter(myWrite);	
	
	p.println(  ("\tLoan Management System\n"+
			"Reference:\t\t\t"+loan.refs+
			"\n==============================================\n"+
			"\nIntrest rate:\t\t\t	"+loan.k+
			"\nRepayment Year:\t\t\t"+loan.k1+
			"\nAmount of Loan:\t\t\t"+"$"+loan.k2+
			"\nMonthly Payment:\t\t\t"+loan.k3+
			"\nTotal Payment:\t\t\t"+loan.txtTotal+
			"\n============================================="+
		
			"\n\n\nThankyou\n" )  );                      
	p.flush();                                        
	p.close();                                  
	JOptionPane.showMessageDialog(this.frame, "Successful");               
	
	} catch (IOException e1)
{
	e1.printStackTrace();

 }

}
	/**
	 * Create the application.
	 */
	public loan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 182, 193));
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(173, 216, 230));
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(138, 53, 808, 506);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Intrest Rate");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(37, 36, 167, 45);
		panel_4.add(lblNewLabel_1);
		
		txtenter = new JTextField();
		txtenter.setBounds(236, 36, 134, 29);
		panel_4.add(txtenter);
		txtenter.setColumns(10);
		
		txtyear = new JTextField();
		txtyear.setColumns(10);
		txtyear.setBounds(236, 109, 134, 29);
		panel_4.add(txtyear);
		
		JLabel lblNumberOfYears = new JLabel("Number of years");
		lblNumberOfYears.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNumberOfYears.setBounds(37, 109, 167, 45);
		panel_4.add(lblNumberOfYears);
		
		txtloan = new JTextField();
		txtloan.setColumns(10);
		txtloan.setBounds(236, 184, 134, 29);
		panel_4.add(txtloan);
		
		JLabel lblAmountOfLoan = new JLabel("Amount of Loan");
		lblAmountOfLoan.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAmountOfLoan.setBounds(37, 184, 167, 45);
		panel_4.add(lblAmountOfLoan);
		
		txtpay = new JTextField();
		txtpay.setColumns(10);
		txtpay.setBounds(236, 261, 134, 29);
		panel_4.add(txtpay);
		
		JLabel lblMonthlyPayment = new JLabel("Monthly payment");
		lblMonthlyPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMonthlyPayment.setBounds(37, 261, 167, 45);
		panel_4.add(lblMonthlyPayment);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(236, 340, 134, 29);
		panel_4.add(txtTotal);
		
		JLabel lblTotalPayment = new JLabel("Total Payment");
		lblTotalPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalPayment.setBounds(37, 340, 167, 45);
		panel_4.add(lblTotalPayment);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(380, 36, 418, 385);
		panel_4.add(textArea);
		
		JButton btnRecipt = new JButton("Receipt");
		btnRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k = txtenter.getText();
				String k1 = txtyear.getText();
				String k2 = txtloan.getText();
				String k3 = txtpay.getText(); 
				
				int refs=1325+(int)(Math.random()*4238);
				
				///////////////////////////////
				textArea.append("\tLoan Management System\n"+
				"Reference:\t\t\t"+refs+
				"\n==============================================\n"+
				"\nIntrest rate:\t\t\t	"+k+
				"\nRepayment Year:\t\t\t"+k1+
				"\nAmount of Loan:\t\t\t"+"$"+k2+
				"\nMonthly Payment:\t\t\t"+k3+
				"\nTotal Payment:\t\t\t"+txtTotal+
				"\n============================================="+
			
				"\n\n\nThankyou\n");
				try
				{
					File myObj = new File("C:\\Users\\User\\Desktop\\Recp.txt");
					if(myObj.createNewFile())
					{
						w();
					}
					else
					{
						w();
					}
				}catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}

			
		});
		btnRecipt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRecipt.setBounds(236, 442, 139, 53);
		panel_4.add(btnRecipt);
		
		JButton btnLoan = new JButton("Calculate");
		btnLoan.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				double r=Double.parseDouble(txtenter.getText());
				
				double mi=r/100;
				
				int y=Integer.parseInt(txtyear.getText());
				
				double l=Double.parseDouble(txtloan.getText());
				
				double m=l*mi/(1-1/Math.pow(1+mi,y*12));   
				//---in month
				String im;
				im=Double.toString(m);
				im=String.format("$%.2f", m);
				txtpay.setText(im);
				
				//---total amount
				double  t=m*y*12;
				String it;
				it=String.format("$%.2f", t);
				txtTotal.setText(it);
				
				//int refs=1325+(int)(Math.random()*4238);


			}
		});
		
		btnLoan.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLoan.setBounds(51, 442, 153, 53);
		panel_4.add(btnLoan);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtenter.setText(null);
				txtyear.setText(null);
				txtloan.setText(null);
				txtpay.setText(null);
				txtTotal.setText(null);
				textArea.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(416, 442, 139, 53);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit !"
						
						, "ATM System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(604, 442, 153, 53);
		panel_4.add(btnExit);
	}

	protected Object getText() {
		// TODO Auto-generated method stub
		return null;
	}



	}

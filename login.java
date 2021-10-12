package foood;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblusername = new JLabel("Account No");
		lblusername.setBounds(87, 77, 70, 14);
		frame.getContentPane().add(lblusername);
		
		JLabel lblpassword = new JLabel("password");
		lblpassword.setBounds(87, 127, 70, 14);
		frame.getContentPane().add(lblpassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(185, 74, 86, 20);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(185, 124, 86, 20);
		frame.getContentPane().add(txtpassword);
		
		JButton btnLOGIN = new JButton("LOGIN");
		btnLOGIN.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String username= txtusername.getText();
				String password= txtpassword.getText();
				
				if(username.equals("1234567890")&&password.equals("1999"))
				{
					JOptionPane.showMessageDialog(null, "Login Successfull");
				txtusername.setText(null);	
				txtpassword.setText(null);

				loan info = new loan();
				loan.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "invalid Username or Password");
				}
			}
		});
		btnLOGIN.setBounds(125, 182, 89, 23);
		frame.getContentPane().add(btnLOGIN);
	}
}

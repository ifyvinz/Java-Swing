package vincent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminFrame extends JFrame implements ActionListener {
	
	   private JLabel nameLabel;
	   private JTextField sText;
	   private JLabel idLabel;
	   private JTextField idText;
	   
	   private JButton loginButton;
	   private JButton homeButton;
	   private JPanel panel;
	   
	   private JMenuBar menuBar;
	   private JMenu file;
	   private JMenuItem exit;
	   private JMenu help;
	   private JMenuItem about ;
	
         public AdminFrame() {
        	 setTitle("Admin");
        	 //setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        			  
        			  setBounds(300,100,700,300);
        			  //setSize(400, 200);
        			  
        			  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        			  setLayout(new BorderLayout());
        			  //setVisible("true");
        	 
        	          Acomp();
        			  
        			 
        	           
         }
         
        public void Acomp() {
        	
        	
        	
        	    menuBar = new JMenuBar();
        	    add(menuBar, BorderLayout.NORTH);
     	        file = new JMenu("File");
     	        menuBar.add(file);
     	        JMenuItem exit = new JMenuItem("Exit");
     	        file.add(exit);
     	        exit.addActionListener(this);
     	        
     	        help = new JMenu("Help");
     	        menuBar.add(help);
     	        about = new JMenuItem("About");
     	        help.add(about);
        	 
        	    panel = new JPanel(new GridLayout(3,1));
				//panel.setBounds(0, 0, 450, 600);
				//panel.setLayout(null);

				nameLabel = new JLabel("Student Name:");
				nameLabel.setBounds(10, 10, 80, 25);
				panel.add(nameLabel);

			    sText = new JTextField(20);
				sText.setBounds(100, 10, 160, 25);
				panel.add(sText);

				idLabel = new JLabel("Neptun:");
				idLabel.setBounds(10, 40, 80, 25);
				panel.add(idLabel);

				idText = new JTextField(20);
				idText.setBounds(100, 40, 160, 25);
				panel.add(idText);

				loginButton = new JButton("Add Student");
				loginButton.setBounds(10, 80, 80, 25);
				loginButton.addActionListener(this);
				panel.add(loginButton);
				
				homeButton = new JButton("Home");
				homeButton.setBounds(10, 80, 80, 25);
				panel.add(homeButton);
				homeButton.addActionListener(this);
				
				
			   add(panel,  BorderLayout.CENTER);
			   
			  
        	 
         }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(loginButton)) {
			String name = sText.getText();
			String id = idText.getText();
			//String mark = Integer.toString(score);
			
			Student st = new Student(name, id);
			
			 Admin ad= new Admin();
			ad.addStudent(st);
			ad.putToFile();
			//pl.putFromFile();
			
			JOptionPane.showMessageDialog(this,"Studdent added");
		}
		else if(e.getSource().equals(homeButton)){
			Home h = new Home();
			h.setVisible(true);
			//dispose();
			
		}
		else if(e.getSource().equals(exit)){
			System.exit(0);
		}
	}
	
	/*public static void main(String[] args) {
	 AdminFrame h = new AdminFrame();
		h.setVisible(true);

	}*/
	
	

}

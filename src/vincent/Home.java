package vincent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Home extends JFrame implements ActionListener {
	
	private JButton admin;
	private JButton  student;
	private JPanel panel;
	
	   private JMenuBar menuBar;
	   private JMenu file;
	   private JMenuItem exit;
	   private JMenu help;
	   private JMenuItem about ;
	
	public Home() {
		super("Library");
		setBounds(300,100,700,300);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		comp();
	}
	
	public void comp() {
		
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
	    
		admin = new JButton("Admin");
		admin.addActionListener(this);
		student = new JButton("Student");
		student.addActionListener(this);
		
		panel = new JPanel(new GridLayout());
		panel.add(admin);
		panel.add(student);
		add(panel,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		Home h = new Home();
		h.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(admin));{
			AdminFrame ad = new AdminFrame();
			ad.setVisible(true);
			dispose();
		}
		if(e.getSource().equals(student)) {
			StudentFrame h = new StudentFrame();
			h.setVisible(true);
			dispose();
		}
		else if(e.getSource().equals(exit)){
			System.exit(0);
		}
		
	}

}

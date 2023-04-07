package vincent;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentFrame extends JFrame implements ActionListener{
       
	 private JLabel nameLabel;
	   private JTextField sText;
	   private JLabel idLabel;
	   private JTextField idText;
	   private JLabel alabel;
	   private JTextField aText;
	   
	   private JButton addButton;
	   private JButton ShowButton;
	   private JPanel panel;
	   
	   
	   public StudentFrame() {
		   super("Books");
		   setBounds(300,100,700,300);
			  //setSize(400, 200);
			  
			  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  setLayout(new BorderLayout());
			  //setVisible("true");
		   
		   scomp();
	   }
	   
	   public void scomp() {
      	 
   	      // panel = new JPanel(new GridLayout(3,1));
   	       panel = new JPanel();
			//panel.setBounds(0, 0, 450, 600);
			panel.setLayout(null); 

			nameLabel = new JLabel("Book Name:");
			nameLabel.setBounds(10, 10, 80, 25);
			panel.add(nameLabel);

		    sText = new JTextField(20);
			sText.setBounds(100, 10, 160, 25);
			panel.add(sText);

			idLabel = new JLabel("Book ID:");
			idLabel.setBounds(10, 40, 80, 25);
			panel.add(idLabel);

			idText = new JTextField(20);
			idText.setBounds(100, 40, 160, 25);
			panel.add(idText);
			
			alabel = idLabel = new JLabel("Author:");
			alabel.setBounds(10, 70, 80, 25);
			panel.add(alabel);
			
			aText = new JTextField(20);
			aText.setBounds(100, 70, 160, 25);
			panel.add(aText);

			addButton = new JButton("Add Book");
			addButton.setBounds(10, 100, 120, 25);
			addButton.addActionListener(this);
			panel.add(addButton);
			
			ShowButton = new JButton("Show Book");
			ShowButton.setBounds(150, 100, 120, 25);
			panel.add(ShowButton);
			ShowButton.addActionListener(this);
			
			
		   add(panel,  BorderLayout.CENTER);
   	 
    }
	   
	   
	   
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = sText.getText();
		String id = idText.getText();
		String aut = aText.getText();
		//String mark = Integer.toString(score);
		
		Book bk = new Book(name, id, aut);
		
		 Student st= new Student();
		 st.addBook(bk);
		
		if(e.getSource().equals(addButton)) {
			
			st.putToFile();
			//pl.putFromFile();
			
			JOptionPane.showMessageDialog(this,"Studdent added");
		}
		else if(e.getSource().equals(ShowButton)){
			st.putFromFile();
			TableFrame h = new TableFrame();
			h.setVisible(true);
			//dispose();
			
		}
		
	}
}

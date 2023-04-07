package vincent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
//import java.awt.Dimension
import java.awt.Dimension;

public class TableFrame extends JFrame {
	
	private BookTableModel tableModel;
	private JTable table;
	private Student myList;
	
	public TableFrame(){
		super("Table");
		 setBounds(300,100,700,300);
	      setResizable(false);
	      
	      setLayout(new BorderLayout());
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      component();
	      
	      
	}
	
	 public void component() {
		  
		      myList = new Student();
		 
		    // Book = new
		      
		      myList.putFromFile();
		      tableModel = new BookTableModel (myList);
		      table = new JTable(tableModel);
		      table.setAutoCreateRowSorter(true);
		      JScrollPane scrollPane = new JScrollPane(table);
		      scrollPane.setPreferredSize(new Dimension(380,280));
		      JPanel panel = new JPanel();
		      panel.add(scrollPane);
		      add(panel,BorderLayout.CENTER);
		      
              /*myList = new PlayerList();
		      
		      myList.putFromFile();
		      tableModel = new PlayerTableModel(myList);
		      table = new JTable(tableModel);
		      table.setAutoCreateRowSorter(true);
		      JScrollPane scrollPane = new JScrollPane(table);
		      scrollPane.setPreferredSize(new Dimension(380,280));
		      JPanel panel = new JPanel();
		      panel.add(scrollPane);
		      add(panel,BorderLayout.EAST);
		      */
		      
		     
		      
		    }
	   
}

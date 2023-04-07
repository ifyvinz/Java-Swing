package vincent;

import java.io.File;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class BookTableModel extends AbstractTableModel{
	
     private ArrayList<Book> bList;
	
	// private File file = new File("player.txt");
	 
	 private String[] columnNames = {"Name","ID","Author"};
	 
	 public BookTableModel(Student myList) {
		 bList = new ArrayList<Book>();
	 }
	 
	 @Override
		public int getColumnCount() {
			
			return columnNames.length;
		}

		@Override
		public int getRowCount() {
			int size;
		      if (bList == null) {
		         size = 0;
		      }
		      else {
		         size = bList.size();
		      }
		      return size;
		}

		@Override
		public Object getValueAt(int row, int col) {
			Object temp = null;
		      if (col == 0) {
		         temp = bList.get(row).getName();
		      }
		      else if (col == 1) {
		         temp = bList.get(row).getId();
		      }
		      else if (col == 2) {
		         temp = bList.get(row).getAuthor();
		      }
		      return temp;
		}
		
		// needed to show column names in JTable
		   public String getColumnName(int col) {
		      return columnNames[col];
		   }
		   public Class getColumnClass(int col) {
		      /*if (col == 2) {
		         return Integer.class;
		      }
		      else {
		         return String.class;
		      }*/
			   
			   return String.class;
		   }

}

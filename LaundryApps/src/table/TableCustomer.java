package table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Model.Customer;


public class TableCustomer extends AbstractTableModel {
	List <Customer> ls;
	private String[] columnNames = {"ID", "Nama", "Alamat", "noHP"};
	public TableCustomer (List <Customer> ls) {
		this.ls = ls;
	}
	@Override
	public int getRowCount() {

		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getColumnName(int column) {
		return columnNames[column];
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return ls.get(rowIndex).getId();
		case 1:
			return ls.get(rowIndex).getNama();
		case 3:
			return ls.get(rowIndex).getAlamat();
		default:
		return null;
			
			
		}
	}
	

}

package table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableOrderDetail extends AbstractTableModel {
List<Model.OrderDetail> OrderDetail;
private String[] columnNames = {"ID Order Detail", "ID Order", "ID Layanan", "Jumlah", "Total"};

public TableOrderDetail(List<Model.OrderDetail> OrderDetail) {
this.OrderDetail = OrderDetail;
}
@Override
public int getRowCount() {
return OrderDetail.size();
}
@Override
public int getColumnCount() {
return columnNames.length;
}
@Override
public String getColumnName(int column) {
return columnNames[column];

}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
Model.OrderDetail orderDetail = OrderDetail.get(rowIndex);
switch (columnIndex) {
case 0:
return orderDetail.getIdorder();
case 1:
return orderDetail.getIdorder();
case 2:
return orderDetail.getIdLayanan();
case 3:
return orderDetail.getJumlah();
case 4:
return orderDetail.getTotal();
default:
return null;
}
}
}
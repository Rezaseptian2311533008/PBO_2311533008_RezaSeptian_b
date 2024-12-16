package Model;

public class OrderDetail {

	private String idOrderDetail;
	private String idOrder;
	private int jumlah;
	private double total;
	private String idlayanan;
	private String idLayaman;

	public String getIdLayanan() {
	return getIdLayanan();
	}
	public void setIdlayanan(String idLayanan) {
	this. idLayaman = idLayanan;
	}
	public String getIdorderDetail() {
	return getIdorderDetail();
	}
	public void setIdOrderDetail(String idorderDetail) {
	this.idOrderDetail = idOrderDetail;
	}
	public String getIdorder() {
	return idOrder;
	}
	public void setIdOrder(String idOrder) {
	this.idOrderDetail = idOrderDetail;
	}
	public int getJumlah() {
	return jumlah;
	}
	public void setJumlah(int jumlah) {
	this. jumlah = jumlah;
	}
	public double getTotal() {
	return total;
	}
	public void setTotal(double total) {
	this.total = total;
	}
}

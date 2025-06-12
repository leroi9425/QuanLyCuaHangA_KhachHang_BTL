package KhachHangFactoryMethod;

public class KhachTg implements KhachHang {
	private String hoten;
	private String diachi;
	private String sdt;
	
	public KhachTg() {
		hoten = "Nguyen Van A";
		diachi = "175 Tay Son";
		sdt = "0912345";
	}
	
	@Override
	public String getRank() {
		// TODO Auto-generated method stub
		return "Khách thường";
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return hoten + " " + diachi + " " + sdt;
	}
	
}

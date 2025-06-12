package KhachHangFactoryMethod;

public class KhachVip implements KhachHang {
	private String hoten;
	private String diachi;
	private String sdt;
	
	public KhachVip() {
		hoten = "Nguyen Van B";
		diachi = "169 Cau Giay";
		sdt = "012345";
	}
	
	@Override
	public String getRank() {
		// TODO Auto-generated method stub
		return "Khách vip";
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return hoten + " " + diachi + " " + sdt;
	}
}

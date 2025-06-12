package KhachHangFactoryMethod;

public abstract class KhachHangFactory  {
	public abstract KhachHang taoKhachHang();
	
	public String getRank() {
		KhachHang kh = taoKhachHang();
		return kh.getRank();
	}
	public String getInfo() {
		KhachHang kh = taoKhachHang();
		return kh.getInfo();
	}
}

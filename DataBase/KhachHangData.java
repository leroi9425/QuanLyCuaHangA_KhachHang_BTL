package DataBase;

public class KhachHangData {
	public int id;
	public String hoten;
	public String diachi;
	public String sdt;
	public String rank;
	
	public KhachHangData() {
	}
	public KhachHangData(int iid, String ihoten, String idiachi, String isdt, String irank) {
		id = iid;
		hoten = ihoten;
		diachi = idiachi;
		sdt = isdt;
		rank = irank;
	}
}

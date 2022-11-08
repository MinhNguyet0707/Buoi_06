package Entity;

import Contant.Specialized;

import java.util.Scanner;

public class Book {
    private static int tuDongTang = 0;
    private  String maSach;
    private  String tenSach;
    private  String tacGia;
    private  String ChuyenNGhanh;
private  int namXuatBan;

    public Book() {
        if(tuDongTang==0){
            tuDongTang=9999;
        }
        tuDongTang ++;
        this.maSach= String.valueOf(tuDongTang);
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNGhanh() {
        return ChuyenNGhanh;
    }

    public void setChuyenNGhanh(String chuyenNGhanh) {
        ChuyenNGhanh = chuyenNGhanh;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Book{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", ChuyenNGhanh='" + ChuyenNGhanh + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
public void nhapSach(){
    System.out.println("Nhập tên sách : ");
    this.tenSach = new Scanner(System.in).nextLine();
    System.out.println("Nhập tên tác giả ");
    this.tacGia = new Scanner(System.in).nextLine();
        System.out.println("Nhập loại chuyên ngành ");
        System.out.println("Vui lòng chọn 1 trong các chuyên ngành dưới đây: ");
        System.out.println("1.Khoa học tự nhiên");
        System.out.println("2.Văn Học Nghệ Thuật");
        System.out.println("3. Điện tử viễn thông ");
    System.out.println("4.Công Nghệ Thông Tin ");
        int luaChon;
        do {
            luaChon = new Scanner(System.in).nextInt();
            if (luaChon >= 1 && luaChon <= 8) {
                break;
            }
            System.out.print("Loại bạn đọc không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        switch (luaChon) {
            case 1:
                this.ChuyenNGhanh = Specialized.khoaHocTuNhien;
                break;
            case 2:
                this.ChuyenNGhanh = Specialized.vanHocNt;
                break;
            case 3:
                this.ChuyenNGhanh = Specialized.dienTuVienThong;
                break;
            case 4:
                this.ChuyenNGhanh=Specialized.congNgheThongTin;
        }
    System.out.println("nhập năm xuất bản");
    this.namXuatBan= new Scanner(System.in).nextInt();
    }


}

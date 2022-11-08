package Entity;

import Contant.ReaderTypeConstant;

import java.util.Scanner;

public class Reader extends Person {
    private static int tuDong = 0;
    private int id;
    private String type;

    public Reader() {
        if (tuDong == 0) {
            tuDong = 9999;
        }
        tuDong++;
        this.id = tuDong;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "entity.Reader{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập loại bạn đọc: ");
        System.out.println("Vui lòng chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Sinh viên.");
        System.out.println("2. Học viên cao học.");
        System.out.println("3. Giảng viên.");

int readerTypeTemp;
    do{
        readerTypeTemp = new Scanner (System.in).nextInt();
        if(readerTypeTemp>=1 && readerTypeTemp<=8){
            break;
        }
        System.out.println("Loại bạn đọc không hợp lệ, vui lòng nhập lại: ");
    } while (true);
        switch (readerTypeTemp){
        case 1:
            this.type = ReaderTypeConstant.STUDENT;
            break;
        case 2:
            this.type = ReaderTypeConstant.POST_UNIVERSITY;
            break;
        case 3:
            this.type = ReaderTypeConstant.TEACHER;
            break;

    }
}
        }



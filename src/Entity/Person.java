package Entity;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String phone;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public void nhapThongTin() {
        System.out.println("Nhập tên bạn đọc: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên SĐT: ");
        this.phone = new Scanner(System.in).nextLine();
    }

}

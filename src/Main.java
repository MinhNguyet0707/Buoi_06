import Entity.Book;
import Entity.Reader;

import java.util.Scanner;

public class Main {
    public static Reader[] readers = new Reader[100];
    public static Book[] books = new Book[200];
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            logicHandle(functionChoice);

        }
    }
    private static void logicHandle(int functionChoice) {
        switch (functionChoice) {
            case 1:
                addNewReader();
                break;
            case 2:
                showAllReader();
                break;
            case 3:
                 addNewBook();
                break;
            case 4:
                showAllBook();
                break;

            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.exit(0);

        }
    }

    private static void showAllReader() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.println(readers[i]);
            }
        }
    }
    private static void showAllBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    private static void addNewReader() {
        System.out.println("Nhập số lượng bạn đọc muốn thêm mới: ");
        int readerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNum; i++) {
            Reader reader = new Reader();
            reader.nhapThongTin();
            saveReader(reader);
        }
    }
    private static void addNewBook() {
        System.out.println("Nhập số lượng sách muốn thêm mới: ");
        int booksNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < booksNum; i++) {
            Book book = new Book();
            book.nhapSach();
            saveBook(book);

        }
    }
    private static void saveReader(Reader reader) {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null) {
                readers[i] = reader;
                break;
            }
        }
    }
    private static void saveBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    private static int chooseFunction() {
        System.out.print("Xin mời chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 8) {
                break;
            }
            System.out.print("Chức năng không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        return functionChoice;
    }
    private static void showMenu() {
        System.out.println("-------PHẦN MỀM QUẢN LÝ MƯỢN SÁCH THƯ VIỆN------");
        System.out.println("1. Thêm bạn đọc mới.");
        System.out.println("2. In ra danh sách bạn đọc có trong thư viện.");
        System.out.println("3. Thêm đầu sách mới.");
        System.out.println("4. In ra danh sách đầu sách có trong thư viện.");
        System.out.println("5. Thực hiện cho bạn đọc mượn sách.");
        System.out.println("6. Sắp xếp danh sách mượn sách.");
        System.out.println("7. Tìm kiếm danh sách mượn sách.");
        System.out.println("8. Thoát chương trình.");
    }

}

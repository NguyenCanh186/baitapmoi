import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Book[] a = new Book[10];
        a[0] = new ProgrammingBook("1", "laptrinh1", 80, "canh", "java", "khong");
        a[1] = new ProgrammingBook("2", "laptrinh2", 80, "canh", "java", "khong");
        a[2] = new ProgrammingBook("3", "laptrinh3", 80, "canh", "java", "khong");
        a[3] = new ProgrammingBook("4", "laptrinh4", 80, "canh", "java", "khong");
        a[4] = new ProgrammingBook("5", "laptrinh5", 80, "canh", "java", "khong");
        a[5] = new FictionBook("6", "kh1", 90, "n.anh", "vientuong");
        a[6] = new FictionBook("7", "kh2", 90, "n.anh", "vientuong");
        a[7] = new FictionBook("8", "kh3", 90, "n.anh", "vientuong");
        a[8] = new FictionBook("9", "kh4", 90, "n.anh", "vientuong");
        a[9] = new FictionBook("10", "kh5", 90, "n.anh", "vientuong");
        int sumPrice = sumPriceBook(a);
        System.out.println("tong gia sach trong thu vien la " + sumPrice);
        int javaBook = countProgrammingBook(a);
        System.out.println("so sach co ngon ngu java la " + javaBook);
        int fictionBook = countFictionBook(a);
        System.out.println("so sach co the loai vien tuong la " + fictionBook);
        int under100 = countNumberBook(a);
        System.out.println("so sach co gia duoi 100 la: " + under100);
        String b = findBook(a);
        System.out.println(b);

    }



    public static int sumPriceBook(Book[] books) {
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        return sum;
    }

    public static int countProgrammingBook(Book[] books) {
        int count = 0;
        String language = "java";
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                if (language.equals(((ProgrammingBook) books[i]).getLanguage())) {
                    count++;
                }
            }
        }
        return count;
    }


    public static int countFictionBook(Book[] books) {
        int count = 0;
        String category = "vientuong";
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                if (category.equals(((FictionBook) books[i]).getCategory())) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countNumberBook(Book[] books) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice() < 100) {
                count++;
            }
        }
        return count;
    }

    public static String findBook(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap cuon sach ban muon tim: ");
        String bookName = scanner.nextLine();
        String result = " ";
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (bookName.equals(books[i].getName())) {
                index = i;
                break;
            }
        }
        if(index == -1){
            result = "khong tim thay";
        } else {
            result = "cuon sach ban tim co gia "
                    + books[index].getPrice()
                    + "tac gia la "
                    + books[index].getAuthor();
        }

        return result;
    }
}

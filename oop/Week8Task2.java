import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Week8Task2 {
    public void nullPointerEx() {
        String str = null;                // tạo biến str có giá trị là null
        System.out.println(str.length()); // lỗi NullPointerException vì str
                                          // đang là null mà gọi độ dài cho str
    }

    public void arrayIndexOutOfBoundsEx() {
        int[] array = {7,9,2,3};      // tạo mảng array có 4 phần tử
        System.out.println(array[6]); // lỗi ArrayIndexOutOfBoundsException
                                      // khi ta gọi tới vị trí index = 6 tức là
                                      // vị trí thứ 7 trong khi mảng chỉ có 4 phần tử
    }

    public void arithmeticEx() {
        int a = 10;
        int b = 0;                 // đặt b bằng 0 để thực hiện phép chia
        System.out.println(a / b); // lỗi ArithmeticException khi thực hiện phép chia cho 0
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        File file = new File("test.txt");       // lấy file không tồn tại
        Scanner scanner = new Scanner(file); // lỗi FileNotFoundException xảy ta khi đọc một file không tồn tại
    }

    public void ioEx() throws IOException {
        FileReader reader = new FileReader("test.txt"); // lỗi IOException cũng như trên là khi đọc
                                                                  // một file không tồn tại vì IOException
                                                                  // là cha của FileNotFoundException
    }

    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "NullPointerException";
        }
        return "Không có lỗi";
    }

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "ArrayIndexOutOfBoundsException";
        }
        return "Không có lỗi";
    }

    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "ArithmeticException";
        }
        return "Không có lỗi";
    }

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "FileNotFoundException";
        }
        return "Không có lỗi";
    }

    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "IOException";
        }
        return "Không có lỗi";
    }
}


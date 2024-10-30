package oasis.JUnit;

public class Week4 {
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    public static int minArray(int[] array) {
        // check mang rong
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Mang rong");
        }

        // lay gia tri dau tien cho min
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                // neu cos gia tri nho hon thi gan lai
                min = array[i];
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        double bmiValue = weight / (height * height);
        bmiValue = Math.round(bmiValue * 10.0) / 10.0;
        if (bmiValue < 18.5) {
            return "Thiếu cân";
        }

        if (bmiValue >= 18.5 && bmiValue < 22.9) {
            return "Thiếu cân";
        }

        if (bmiValue >= 23 && bmiValue < 24.9) {
            return "Thừa cân";
        }
        if (bmiValue >= 25) {
            return "Béo phì";
        }

        return "";
    }
}

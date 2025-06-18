public class Triangle {
public static String triangle(int a, int b, int c) {
    if (a + b <= c || a + c <= b || b + c <= a) {
        return "Khong phai tam giac";
    }

    if (a == b && b == c ) {
        return "Tam giac deu";
    }

    if (a == b  || a == c || b == c) {
        return "Tam giac can";
    }
    if (a * a + b * b == c * c ||
            a * a + c * c == b * b ||
            b * b + c * c == a * a) {
        return "Tam giac vuong";
    }

    return "Tam giac thuong";
}
}

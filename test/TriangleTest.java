import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TriangleTest {
    //Khong phai tam giac
    @Test
    public void Triangle01(){
        int a =3;
        int b =4;
        int c =8;
        String expected = "Khong phai tam giac";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    @Test
    public void Triangle02(){
        int a =3;
        int b =8;
        int c =4;
        String expected = "Khong phai tam giac";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    @Test
    public void Triangle03(){
        int a =8;
        int b =3;
        int c =4;
        String expected = "Khong phai tam giac";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    //Tam giac deu
    @Test
    public void Triangle04(){
        int a =3;
        int b =3;
        int c =3;
        String expected = "Tam giac deu";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    //Tam giac can
    @Test
    public void Triangle05(){
        int a =3;
        int b =3;
        int c =4;
        String expected = "Tam giac can";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    @Test
    public void Triangle06(){
        int a =3;
        int b =4;
        int c =3;
        String expected = "Tam giac can";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    @Test
    public void Triangle07(){
        int a =4;
        int b =3;
        int c =3;
        String expected = "Tam giac can";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    //Tam giac thuong
    @Test
    public void Triangle08(){
        int a =5;
        int b =6;
        int c =7;
        String expected = "Tam giac thuong";
        String actual = Triangle.triangle(a,b,c);

        assertEquals(expected,actual);
    }
    //Tam giac vuong
    @Test
    public void Triangle09(){
        int a =3;
        int b =4;
        int c =5;
        String expected = "Tam giac vuong";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
    @Test
    public void Triangle10(){
        int a =3;
        int b =4;
        int c =5;
        String expected = "Tam giac vuong";
        String actual = Triangle.triangle(a,b,c);

        assertEquals(expected,actual);
    }
    @Test
    public void Triangle11(){
        int a =5;
        int b =3;
        int c =4;
        String expected = "Tam giac vuong";
        String actual = Triangle.triangle(a,b,c);

        assert expected.equals(actual);
    }
}

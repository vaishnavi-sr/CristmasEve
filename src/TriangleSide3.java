import java.sql.SQLOutput;

public class TriangleSide3 {
        public static int nextEdge(int side1, int side2) {
            int side3=(side1+side2)-1;
            return side3;
        }

    public static void main(String[] args) {
        System.out.println(nextEdge(8, 10));

        System.out.println(nextEdge(5, 7));

       System.out.println(nextEdge(9, 2));
    }
    }


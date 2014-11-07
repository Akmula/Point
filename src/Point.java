public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double MyPerimetr(Point A, Point B, Point C, Point D) {
        double AB = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        double BC = Math.sqrt((B.x - C.x) * (B.x - C.x) + (B.y - C.y) * (B.y - C.y));
        double CD = Math.sqrt((C.x - D.x) * (C.x - D.x) + (C.y - D.y) * (C.y - D.y));
        double DA = Math.sqrt((D.x - A.x) * (D.x - A.x) + (D.y - A.y) * (D.y - A.y));
        double P = AB + BC + CD + DA;
        return P;
    }

    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(0, 7);
        Point C = new Point(7, 7);
        Point D = new Point(7, 0);
        System.out.println(MyPerimetr(A, B, C, D));
    }
}
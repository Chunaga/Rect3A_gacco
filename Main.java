import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Rect3A r1 = new Rect3A();
        r1.SetData(10,20,30,40);
	r1.printInfo();
	System.out.println("面積は" + r1.calcArea());
	System.out.println("-------------------------");
	System.out.println("x方向に30, y方向に50移動する");
	r1.translate(30, 50);
	r1.printInfo();

    }
}
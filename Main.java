import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Rect3A r1 = new Rect3A();
        r1.SetData(10,20,30,40);
        System.out.println("長方形の位置"+ r1.x + "," + r1.y + "幅" + r1.width + "高さ" + r1.height);
    }
}
import java.util.Scanner;

public class User {

    Scanner scanner;

    public void action_1(ImageInterface image, String name, int x, int y) {
        System.out.println("action1() "+this);
        image.getColor(name, x, y);
    }
}

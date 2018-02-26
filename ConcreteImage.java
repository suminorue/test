import java.awt.*;
import java.util.Scanner;

public class ConcreteImage implements ImageInterface {

    String name;
    String description;
    //Scanner scanner=new Scanner(System.in);
    //private static HashMap<String,ConcreteImage> hashMap=new HashMap<String, ConcreteImage>();

    ConcreteImage(String name) {
        this.name=name;
        System.out.println("ConcreteImage() "+this);
        //this.hashMap.put(name,this);
    }
    /*ConcreteImage(String name, Scanner scanner) {
        this.name=name;
        this.description=scanner.next();
    }*/

    @Override
    public Color getColor(String name, int x, int y) {
        System.out.println("getColor() "+this);
        return new Color(this.name.hashCode()%255,x%255,y%255);
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ConcreteImage) {
            if(this.name.equals(((ConcreteImage) obj).name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

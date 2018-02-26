import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Proxy implements ImageInterface {

    protected HashMap<String,Color> colorHashMap =new HashMap<String, Color>();
    private HashMap<String,String> compressedHashMap =new HashMap<String, String>();

    Proxy() {
        System.out.println("Proxy() "+this);
    }

    @Override
    public Color getColor(String name, int x, int y) {
        System.out.println("getColor() "+this);
        if(colorHashMap.containsKey(name)) {
            return colorHashMap.get(name);
        }
        ConcreteImage image =new ConcreteImage(name);
        colorHashMap.put(name,image.getColor(name, x, y));
        return colorHashMap.get(name);
    }
}

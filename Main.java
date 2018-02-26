public class Main {
    public static void main(String[] args) {
        Proxy proxy=new Proxy();
        User user=new User();
        user.action_1(proxy,"test",1,2);
        System.out.println("===========");
        user.action_1(proxy,"test",2,2);

    }
}

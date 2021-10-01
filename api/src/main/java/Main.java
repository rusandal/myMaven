public class Main {

    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println("Set="+myService.getMyEntity());
        System.out.println("Set="+myService.setMyEntity(new MyEntity("second")));
        System.out.println("Get="+myService.getMyEntity());
    }
}

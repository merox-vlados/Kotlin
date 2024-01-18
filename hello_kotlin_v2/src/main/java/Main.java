public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Moscow", "Green", 150);
        Address address2 = new Address("Moscow", "Green", 150);


        if(address1.equals(address2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }


}

package hello.core.singleton;

public class StatefulService {

//    private int price;

    /*public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; // 여기가 문제 구간
    }*/

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제 구간
        return price;
    }

    /*public int getPrice() {
        return price;
    }*/
}

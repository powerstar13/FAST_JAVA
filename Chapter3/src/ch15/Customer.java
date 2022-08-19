package ch15;

public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("Cusotmer buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    @Override
    public void order() {
        // default 메서드를 어떻게 사용할지 정의해야 한다,
//        Buy.super.order(); // Buy의 default 메서드를 사용하는 방법
//        Sell.super.order(); // Sell의 default 메서드를 사용하는 방법
        // 재정의하는 방법
        System.out.println("Customer order");
    }

    public void hello() {
        System.out.println("hello");
    }
}

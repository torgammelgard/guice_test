package se.torgammelgard;

import com.google.inject.Inject;

public class SuperMall {

    // field injection
    @Inject
    private Roof roof;

    private Shop shop;

    // constructor injection
    @Inject
    public SuperMall(Shop shop) {
        this.shop = shop;
    }

    void printShopName() {
        System.out.println(shop.getName());
    }

    void printRoofType() {
        System.out.println(roof.getTypeOfRoof());
    }
}

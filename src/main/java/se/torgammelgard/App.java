package se.torgammelgard;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String[] args) {
        final Injector injector = Guice.createInjector(new SuperMallModule());
        final SuperMall superMall = injector.getInstance(SuperMall.class);
        superMall.printShopName();
        superMall.printRoofType();
    }
}




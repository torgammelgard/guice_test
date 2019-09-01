package se.torgammelgard;

import com.google.inject.AbstractModule;

public class SuperMallModule extends AbstractModule {
    protected void configure() {
        bind(Shop.class).to(CandyShopImpl.class);
        bind(Roof.class).to(RoofImpl.class);
    }
}

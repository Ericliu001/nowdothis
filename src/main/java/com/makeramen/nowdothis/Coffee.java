package com.makeramen.nowdothis;

import javax.inject.Inject;

public class Coffee {
    private final Water water;

    @Inject
    public Coffee(final Water water) {this.water = water;}
}

package com.makeramen.nowdothis.ui;

import com.google.gson.Gson;
import com.makeramen.nowdothis.Coffee;
import com.makeramen.nowdothis.Water;

import javax.inject.Inject;

public class ConsumerOfDependentComponent {

    @Inject Gson gson;

    @Inject Water water;

    @Inject Coffee coffee;
}

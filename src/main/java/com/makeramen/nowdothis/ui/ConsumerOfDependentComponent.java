package com.makeramen.nowdothis.ui;

import com.google.gson.Gson;

import javax.inject.Inject;

public class ConsumerOfDependentComponent {

    @Inject Gson gson;

    @Inject String water;
}

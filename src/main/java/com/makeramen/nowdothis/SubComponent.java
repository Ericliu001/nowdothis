package com.makeramen.nowdothis;

import com.google.gson.Gson;
import com.makeramen.nowdothis.ui.ConsumerOfSubComponent;
import com.squareup.okhttp.OkHttpClient;

import dagger.Subcomponent;

@Subcomponent(modules = WaterModule.class)
public interface SubComponent {
    void inject(ConsumerOfSubComponent consumerOfSubComponent);

    Gson gson();

    OkHttpClient okHttpClient();

    String water();
}

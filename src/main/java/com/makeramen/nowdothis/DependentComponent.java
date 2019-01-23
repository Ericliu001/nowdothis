package com.makeramen.nowdothis;

import com.google.gson.Gson;
import com.makeramen.nowdothis.ui.ConsumerOfDependentComponent;
import com.squareup.okhttp.OkHttpClient;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import dagger.Component;

import static java.lang.annotation.RetentionPolicy.CLASS;

@DependentComponent.DependentScope
@Component(modules = WaterModule.class, dependencies = NowDoThisAppComponent.class)
public interface DependentComponent {

    void inject(ConsumerOfDependentComponent consumerOfDependentComponent);

    Gson gson();

    OkHttpClient okHttpClient();

    String water();

    @Scope
    @Retention(CLASS)
    @interface DependentScope { }
}

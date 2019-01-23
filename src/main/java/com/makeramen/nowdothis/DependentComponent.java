package com.makeramen.nowdothis;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import dagger.Component;

import static java.lang.annotation.RetentionPolicy.CLASS;

@DependentComponent.DependentScope
@Component(dependencies = NowDoThisAppComponent.class)
public interface DependentComponent {

    Gson gson();

    OkHttpClient okHttpClient();

    @Scope
    @Retention(CLASS)
    @interface DependentScope { }
}

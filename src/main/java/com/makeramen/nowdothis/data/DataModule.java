package com.makeramen.nowdothis.data;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.makeramen.nowdothis.dagger.PerApp;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

  static final String PREFS_DEFAULT = "nowdothis";

  @Provides @PerApp SharedPreferences provideSharedPrefs(Application app) {
    return app.getSharedPreferences(PREFS_DEFAULT, Context.MODE_PRIVATE);
  }

  @Provides @PerApp Gson provideGson() {
    return new Gson();
  }

  @Provides @Named("Small")
  public int smallQuantity() {
    return 10;
  }
  @Provides @Named("Medium")
  public int mediumQuantity(){
    return 20;
  }
  @Provides @Named("Large")
  public int largeQuantity(){
    return 30;
  }
}

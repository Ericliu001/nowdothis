package com.makeramen.nowdothis;

import android.app.Application;
import android.content.Context;

public class NowDoThisApp extends Application {

  private NowDoThisAppComponent component;
  private DependentComponent dependentComponent;
  private SubComponent subComponent;

  @Override public void onCreate() {
    super.onCreate();

    component = DaggerNowDoThisAppComponent.builder()
        .nowDoThisModule(new NowDoThisModule(this))
        .build();
    dependentComponent = DaggerDependentComponent.builder()
            .nowDoThisAppComponent(getComponent(this))
            .waterModule(new WaterModule())
            .build();

    subComponent = component.provideSubComponent();
  }

  public static NowDoThisAppComponent getComponent(Context context) {
    return ((NowDoThisApp) context.getApplicationContext()).component;
  }

  public static DependentComponent getDependentComponent(Context context) {
    return ((NowDoThisApp) context.getApplicationContext()).dependentComponent;
  }

  public static SubComponent getSubComponent(Context context) {
    return ((NowDoThisApp) context.getApplicationContext()).subComponent;
  }
}

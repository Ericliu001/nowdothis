package com.makeramen.nowdothis.ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import com.makeramen.nowdothis.NowDoThisApp;
import com.makeramen.nowdothis.data.TodoStorage;

import javax.inject.Inject;
import javax.inject.Named;

public class NowDoThisActivity extends Activity {
  @Inject TodoStorage todoStorage;
  @Inject @Named("Medium") public int waterQuantity;


  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    NowDoThisApp.getComponent(this).inject(this);
    NowDoThisApp.getDependentComponent(this).inject(new ConsumerOfDependentComponent());
    NowDoThisApp.getSubComponent(this).inject(new ConsumerOfSubComponent());

    if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
      Fragment fragment = todoStorage.getTodos().length > 0
          ? new TodoFragment()
          : new EditListFragment();
      getFragmentManager().beginTransaction()
          .replace(android.R.id.content, fragment)
          .commit();
    }
  }
}

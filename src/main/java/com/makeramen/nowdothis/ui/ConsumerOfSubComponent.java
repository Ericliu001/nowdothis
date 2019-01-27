package com.makeramen.nowdothis.ui;

import com.makeramen.nowdothis.Coffee;
import com.makeramen.nowdothis.data.TodoStorage;

import javax.inject.Inject;

public class ConsumerOfSubComponent {

    @Inject TodoStorage todoStorage;
    @Inject Coffee coffee;

    private void doSomething(){
        todoStorage.getTodos();
    }
}

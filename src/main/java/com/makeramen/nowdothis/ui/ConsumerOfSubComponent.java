package com.makeramen.nowdothis.ui;

import com.makeramen.nowdothis.data.TodoStorage;

import javax.inject.Inject;

public class ConsumerOfSubComponent {

    @Inject TodoStorage todoStorage;

    private void doSomething(){
        todoStorage.getTodos();
    }
}

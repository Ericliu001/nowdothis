package com.makeramen.nowdothis;

import dagger.Module;
import dagger.Provides;

@Module
public class WaterModule {
    @Provides
    public String provideWater(){
        return "Water";
    }
}

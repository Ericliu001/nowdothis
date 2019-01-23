package com.makeramen.nowdothis;

import dagger.Module;
import dagger.Provides;

@Module
public class WaterModule {
    @DependentComponent.DependentScope
    @Provides
    public String provideWater(){
        return "Water";
    }
}

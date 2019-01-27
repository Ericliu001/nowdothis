package com.makeramen.nowdothis;

import dagger.Module;
import dagger.Provides;

@Module
public class WaterModule {
    @Provides
    public Water provideWater(){
        return new Water();
    }
}

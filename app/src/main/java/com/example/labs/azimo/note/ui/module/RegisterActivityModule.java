package com.example.labs.azimo.note.ui.module;

import com.example.labs.azimo.note.api.manager.ApiErrorManager;
import com.example.labs.azimo.note.ui.activity.RegisterActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by F1sherKK on 26/07/2017.
 */

@Module
public class RegisterActivityModule {
    @Provides
    public ApiErrorManager provideApiErrorManager(RegisterActivity registerActivity) {
        return new ApiErrorManager(registerActivity);
    }
}
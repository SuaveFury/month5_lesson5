package com.example.homework5.di

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class Module  {

@Provides
fun preferFun (@ApplicationContext context: Context): SharedPreferences {
    return context.getSharedPreferences("preferences", MODE_PRIVATE)
}
}
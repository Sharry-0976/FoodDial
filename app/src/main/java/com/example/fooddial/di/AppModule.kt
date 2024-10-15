package com.example.fooddial.di

import android.content.Context
import com.example.fooddial.data.repository.HomeRepositoryImpl
import com.example.fooddial.data.repository.LoginRepositoryImpl
import com.example.fooddial.data.repository.UserDataRepositoryImpl
import com.example.fooddial.domain.repository.HomeRepository
import com.example.fooddial.domain.repository.LoginRepository
import com.example.fooddial.domain.repository.UserDataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLoginRepository(
        @ApplicationContext context: Context
    ): LoginRepository = LoginRepositoryImpl(context = context)

    @Provides
    @Singleton
    fun providesHomeRepository(): HomeRepository = HomeRepositoryImpl()

    @Provides
    @Singleton
    fun providesUserDataRepository(): UserDataRepository = UserDataRepositoryImpl()




}
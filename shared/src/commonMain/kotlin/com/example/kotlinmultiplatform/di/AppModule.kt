package com.example.kotlinmultiplatform.di

import com.example.kotlinmultiplatform.network.NetworkModule
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module

@Module(includes = [NetworkModule::class])
@Configuration
@ComponentScan("com.example.kotlinmultiplatform")
class AppModule
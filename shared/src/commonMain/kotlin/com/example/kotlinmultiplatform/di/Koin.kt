package com.example.kotlinmultiplatform.di

import org.koin.dsl.KoinAppDeclaration
import org.koin.plugin.module.dsl.startKoin

fun initKoin(
    appDeclaration: KoinAppDeclaration = {}
) {
    startKoin<MyApp> {
        appDeclaration()
    }
}

fun initKoin() = initKoin {}

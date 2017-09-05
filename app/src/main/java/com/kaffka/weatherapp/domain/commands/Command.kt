package com.kaffka.weatherapp.domain.commands


interface Command<out T> {
    fun execute(): T
}
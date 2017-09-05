package com.kaffka.weatherapp.domain.commands

/**
 * Created by gabrielkaffka on 04/09/17.
 */
interface Command<out T> {
    fun execute(): T
}
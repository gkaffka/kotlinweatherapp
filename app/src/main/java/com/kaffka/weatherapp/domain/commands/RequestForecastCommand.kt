package com.kaffka.weatherapp.domain.commands

import com.kaffka.weatherapp.data.ForecastRequest
import com.kaffka.weatherapp.domain.mapper.ForecastDataMapper
import com.kaffka.weatherapp.domain.model.ForecastList

/**
 * Created by gabrielkaffka on 04/09/17.
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}
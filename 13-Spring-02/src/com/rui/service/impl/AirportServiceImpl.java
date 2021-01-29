package com.rui.service.impl;

import java.util.List;

import com.rui.mapper.AirportMapper;
import com.rui.pojo.Airport;
import com.rui.service.AirportService;

public class AirportServiceImpl implements AirportService {
	private AirportMapper airportMapper;
	
	public AirportMapper getAirportMapper() {
		return airportMapper;
	}

	public void setAirportMapper(AirportMapper airportMapper) {
		this.airportMapper = airportMapper;
	}

	@Override
	public List<Airport> showAll() {
		return airportMapper.selAll();
	}
	

}

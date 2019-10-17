package com.stackroute.swag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
 @Api

public class DepartureControler {

	@ApiOperation(value="Get details about departure")
	@GetMapping(value="/departure/all")
	public ResponseEntity<?> getallDeparture()
	{
		return new ResponseEntity("All Departure",HttpStatus.OK);
	}
}

package com.stackroute.swag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller

@Api
public class ArrivalController {
	
	@ApiOperation(value="Get details about fligh arrivals")
	@GetMapping(value="/arrival/all")
	public ResponseEntity<?> getallarrival()
	{
		return new ResponseEntity("all arrivals",HttpStatus.OK);
	}
	
	@ApiOperation(value="Get details about flight arrival")
@GetMapping(value="/arrival/{id}")
	public ResponseEntity<?> getflightarrival(@PathVariable(value="id") String id)
	{
		return new ResponseEntity(id,HttpStatus.OK);
	}

}

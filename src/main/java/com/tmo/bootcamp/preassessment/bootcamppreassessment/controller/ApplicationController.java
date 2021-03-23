package com.tmo.bootcamp.preassessment.bootcamppreassessment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmo.bootcamp.preassessment.model.AppResponse;

/**
 * Controller class for the Application
 * @author ryadav23
 *
 */
@RestController
public class ApplicationController {
	
	private static int TEN = 10;
	
	@GetMapping(value = "/")
	public String home() {
		return "Welcome to Bootcamp";
	}

	/**
	 * 
	 * @param num
	 * @return
	 */
	@GetMapping(value = "/{num}")
	@ResponseBody
	public AppResponse addTenToInput(@PathVariable("num") int num) {

		AppResponse response = new AppResponse();
		response.setSum(num + TEN);

		return response;

	}

	/**
	 * the method adds the input
	 * @param number1
	 * @param number2
	 * @return
	 */
	@GetMapping(value = "/{number1}/{number2}")
	@ResponseBody
	public AppResponse add(@PathVariable("number1") int number1, @PathVariable("number2") int number2) {

		AppResponse response = new AppResponse();
		response.setSum(number1 + number2);

		return response;

	}
	
	/**
	 * Exception handling for the Application
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(value = Throwable.class)
	   public ResponseEntity<Object> exception(Throwable exception) {
		  String error = "Invalid Input";
	      return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	   }
}

package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.api.Fibonacci;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-16T22:06:51.143Z")

@Controller
public class FiboacciApiController implements FiboacciApi {

	private static final Logger log = LoggerFactory.getLogger(FiboacciApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public FiboacciApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<String> fibonacci(
			@ApiParam(value = "The upper bound of the interval.", required = true) @PathVariable("k") String k,
			@ApiParam(value = "The lower bound of the interval.", defaultValue = "0") @PathVariable("i") String i) {
//		String accept = request.getHeader("Accept");
//		HttpHeaders responseHeaders = new HttpHeaders();

		Fibonacci fiboString = new Fibonacci();
		int upper_bound = Integer.parseInt(k);
		int lower_bound = Integer.parseInt(i);
		if (upper_bound < lower_bound)
			return new ResponseEntity<String>("upper_bound is less than lower_bound", HttpStatus.BAD_REQUEST);

		if (upper_bound < 0) {
			return new ResponseEntity<String>("Enter the value of input larger than 0 please", HttpStatus.BAD_REQUEST);
		}
		
//Call the method which would find fibonacci series
		String fiboSeries = fiboString.getFibonacci(lower_bound, upper_bound);

		return new ResponseEntity<String>(fiboSeries, HttpStatus.CREATED);
	}

}

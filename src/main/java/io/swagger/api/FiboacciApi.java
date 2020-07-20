/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-16T22:06:51.143Z")

@Api(value = "fiboacci", description = "the fiboacci API")
@RequestMapping(value = "/v1")
public interface FiboacciApi {

    @ApiOperation(value = "Returns the Fibonacci numbers in interval [i,k]", nickname = "fibonacci", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The Fibonacci sequence in [i,k]", response = String.class) })
    @RequestMapping(value = "/fiboacci/{i}/{k}",
        method = RequestMethod.GET)
    ResponseEntity<String> fibonacci(@ApiParam(value = "The upper bound of the interval.",required=true) @PathVariable("k") String k, @ApiParam(value = "The lower bound of the interval.",required=true) @PathVariable("i") String i);

}
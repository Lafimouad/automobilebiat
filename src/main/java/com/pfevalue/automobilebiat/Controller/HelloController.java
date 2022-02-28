package com.pfevalue.automobilebiat.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")

public class HelloController {

    @GetMapping( value = "/test")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "GET A HELLO MESSAGE")
    public ResponseEntity<String> sayHello( ) {
final  String body="Hellpo";
return ResponseEntity.ok(body);
    }
}

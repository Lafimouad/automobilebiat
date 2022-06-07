package com.pfevalue.automobilebiat.Controller;

import com.pfevalue.automobilebiat.Entity.Marque;
import com.pfevalue.automobilebiat.Service.MarqueInterface;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MarqueController {
    @Autowired
    MarqueInterface marqueInterface;

    // Get Marque List
    @GetMapping( value = "/marque")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is to fetch All the Marques stored in Db")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Details of All the Marques",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Page not found",
                    content = @Content)
    })
    public ResponseEntity<List<Marque>> getListDeMarques( ) {
        List<Marque> marqueList = marqueInterface.retrieveAllMarques();
        return ResponseEntity.ok(marqueList);
    }

    // Add Marque
    @PostMapping("/marque")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "This is to add  the brands in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = " brand details saved in database",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Page Not Found",
                    content = @Content)
    })

    ResponseEntity<?> addMarque(@RequestBody Marque marque) {

        Marque marque1= marqueInterface.addMarque(marque);
        return new ResponseEntity<>(marque1, HttpStatus.CREATED);
    }

    // find Marque ByID
    @GetMapping("marque/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is to get a brands by the id in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = " brand found",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Page Not Found",
                    content = @Content)
    })
    ResponseEntity<?> getMarqueById(@PathVariable Long id) {
        return new ResponseEntity<>(marqueInterface.FindMarque(id), HttpStatus.OK);

    }

    // Delete A Marque
    @DeleteMapping("marque/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is to delete  the brand in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = " brand deleted from the database",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Page Not Found",
                    content = @Content)
    })
    ResponseEntity<?> deleteMarqueById(@PathVariable Long id) {
        marqueInterface.deleteMarque(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);

    }
    // Update A Marque
    @PutMapping("/marque")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "This is to update  the brands in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = " brand details updated in database",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Page Not Found",
                    content = @Content)
    })
    ResponseEntity<?> updateMarqu(@RequestBody Marque marque) {
        marqueInterface.updateMarque(marque);
        return new ResponseEntity<>("Product Updated", HttpStatus.CREATED);
    }



    // find Marque ByID
    @GetMapping("marque/v1/{nom}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "This is to get a brands by the nom in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = " brand found",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
                    description = " Page Not Found",
                    content = @Content)
    })
    ResponseEntity<?> getMarqueByName(@PathVariable String nom) {
        return new ResponseEntity<>(marqueInterface.findMarqueByName(nom), HttpStatus.OK);

    }

}



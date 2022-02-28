package com.pfevalue.automobilebiat.Controller;

import com.pfevalue.automobilebiat.Entity.Marque;
import com.pfevalue.automobilebiat.Service.MarqueInterface;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value = "GET List de Marque")
    public ResponseEntity<List<Marque>> getListDeMarques( ) {
        List<Marque> marqueList = marqueInterface.retrieveAllMarques();
        return ResponseEntity.ok(marqueList);
    }

    // Add Marque
    @PostMapping("/marque")
    @ApiOperation(value = "Add Marque")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> addMarque(@RequestBody Marque marque) {

        Marque marque1= marqueInterface.addMarque(marque);
        return new ResponseEntity<>(marque1, HttpStatus.CREATED);
    }

    // find Marque ByID
    @ApiOperation(value = "Get Marque ById")
    @GetMapping("marque/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<?> getMarqueById(@PathVariable Long id) {
        return new ResponseEntity<>(marqueInterface.FindMarque(id), HttpStatus.OK);

    }

    // Delete A Marque
    @ApiOperation(value = "Delete A Marque")
    @DeleteMapping("marque/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<?> deleteMarqueById(@PathVariable Long id) {
        marqueInterface.deleteMarque(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);

    }
    // Update A Marque
    @PutMapping("/marque")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Update A Marque")
    ResponseEntity<?> updateMarqu(@RequestBody Marque marque) {
        marqueInterface.updateMarque(marque);
        return new ResponseEntity<>("Product Updated", HttpStatus.CREATED);
    }


}



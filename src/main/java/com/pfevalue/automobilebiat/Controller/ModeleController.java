package com.pfevalue.automobilebiat.Controller;


import com.pfevalue.automobilebiat.Entity.Modele;
import com.pfevalue.automobilebiat.Service.ModeleInterface;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ModeleController {
    @Autowired
    ModeleInterface modeleInterface ;

    // Get Modele List
    @GetMapping( value = "/modele")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "GET List de Modele")
    public ResponseEntity<List<Modele>> getListDeModeles( ) {
        List<Modele> marqueList = modeleInterface.retrieveAllModeles();
        return ResponseEntity.ok(marqueList);
    }

    // Add Modele


    @PostMapping("/modele")
    @ApiOperation(value = "Add Modele")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> addModele(@RequestBody Modele modele) {

        Modele modele1= modeleInterface.addModele(modele);
        return new ResponseEntity<>(modele1, HttpStatus.CREATED);
    }

    // find Modele ByID
    @ApiOperation(value = "Get Modele ById")
    @GetMapping("modele/{id}")
    ResponseEntity<?> getModeleById(@PathVariable Long id) {
        return new ResponseEntity<>(modeleInterface.FindModele(id), HttpStatus.OK);

    }

    // find Modele marque id
    @ApiOperation(value = "Get Modeles By marque id")
    @GetMapping("modele/marque/{id}")
    ResponseEntity<?> getModeleByMarque(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(modeleInterface.findModeleByMarque(id), HttpStatus.OK);

    }

    // Delete A Modele
    @ApiOperation(value = "Delete Modele")
    @DeleteMapping("modele/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<?> deleteModeleById(@PathVariable Long id) {
        modeleInterface.deleteModele(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);

    }
    // Update A Modele
    @PutMapping("/modele")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Update Modele")
    ResponseEntity<?> updateModele(@RequestBody Modele modele) {
        modeleInterface.updateModele(modele);
        return new ResponseEntity<>("Product Updated", HttpStatus.CREATED);
    }


    @GetMapping("/getcarnumber")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "get Car number")
    ResponseEntity<?> getCarNumber() {

        return new ResponseEntity<>(modeleInterface.sommeNumberCar(), HttpStatus.OK);
    }

}

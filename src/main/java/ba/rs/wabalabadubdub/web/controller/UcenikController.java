package ba.rs.wabalabadubdub.web.controller;

import ba.rs.wabalabadubdub.model.Ucenik;
import ba.rs.wabalabadubdub.service.UcenikService;
import ba.rs.wabalabadubdub.web.DTO.UcenikDTO;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alligator on 13.4.17..
 */
@RestController
@RequestMapping(value = "api/ucenik")
public class UcenikController {

    @Autowired
    private UcenikService ucenikService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<UcenikDTO>> getAllUcenici(){
        List<Ucenik> ucenici = ucenikService.findAll();
        List<UcenikDTO> uceniciDTO = new ArrayList<UcenikDTO>();
        for (Ucenik u : ucenici){
            uceniciDTO.add(new UcenikDTO(u));
        }
        return new ResponseEntity<List<UcenikDTO>>(uceniciDTO, HttpStatus.OK);

    }

}

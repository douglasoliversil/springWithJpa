package com.example.demo.controller;

import com.example.demo.ClientDTO;
import com.example.demo.ResponseObject;
import com.example.demo.service.ClientService;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    ClientService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClientDTO>> getAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseObject> save(@RequestBody ClientDTO clientDTO) {
        ResponseObject responseObject = service.save(clientDTO);
        return new ResponseEntity<>(responseObject, responseObject.getStatus()) ;
    }
}

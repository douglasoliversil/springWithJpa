package com.example.demo.service;

import com.example.demo.ClientDTO;
import com.example.demo.ResponseObject;
import com.example.demo.data.Client;
import com.example.demo.data.ClientDAO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientDAO mDAO;


    ModelMapper mapper = new ModelMapper();

    public List<ClientDTO> findAll() {
        List<Client> queryResult = mDAO.findAll();
        List<ClientDTO> dtos = new ArrayList<>();
        for (Client client : queryResult)
            dtos.add(mapper.map(client, ClientDTO.class));
        return dtos;
    }

    public ResponseObject save(ClientDTO clientDTO) {
        try {
            mDAO.save(mapper.map(clientDTO, Client.class));
            return new ResponseObject(HttpStatus.OK,null);
        } catch (Exception e) {
            return new ResponseObject(HttpStatus.CONFLICT,e.getMessage());
        }
    }
}

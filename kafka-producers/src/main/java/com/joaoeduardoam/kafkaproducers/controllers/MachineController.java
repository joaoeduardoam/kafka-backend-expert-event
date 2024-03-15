package com.joaoeduardoam.kafkaproducers.controllers;


import com.joaoeduardoam.kafkaproducers.services.MachineService;
import lombok.RequiredArgsConstructor;
import models.requests.CreateMachineRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("machines")
@RequiredArgsConstructor
public class MachineController {

    private final MachineService machineService;

    @PostMapping
    ResponseEntity<Void> createEvent(@RequestBody CreateMachineRequest request){

        machineService.createEvent(request);

        return ResponseEntity.ok().build();

    }


}

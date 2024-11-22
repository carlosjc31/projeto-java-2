package com.agenda.agenda_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendaController {
 
    @GetMapping("agenda")
    public String getAgenda(){
        return "Bem-vindo a Agenda";
    }
}

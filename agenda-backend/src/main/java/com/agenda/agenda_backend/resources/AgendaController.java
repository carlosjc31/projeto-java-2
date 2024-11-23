package com.agenda.agenda_backend.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.agenda_backend.modelos.Agenda;

@RestController
public class AgendaController {
 
    @GetMapping("agenda")
    public Agenda getAgendas() throws ParseException {

        Agenda ag = new Agenda();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // o SimpleDateFormat serve para converter a String para Date

        ag.setId(1);
        Date data = sdf.parse("02/11/2024 08:00:00");
        ag.setData(data);
        ag.setDescricao("Prova de Glauco");
        ag.setLocal("Fatec Itu, lab 6");


        return ag;
    }
}

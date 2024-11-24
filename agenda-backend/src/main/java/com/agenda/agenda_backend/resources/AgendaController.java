package com.agenda.agenda_backend.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.agenda_backend.modelos.Agenda;

import jakarta.annotation.PostConstruct;

@RestController
public class AgendaController {

    private List<Agenda> agendas = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @PostConstruct
    public void init() throws ParseException {

        Agenda ag1 = new Agenda();
        ag1.setId(1);
        Date data1 = sdf.parse("02/11/2024 08:00:00");
        ag1.setData(data1);
        ag1.setDescricao("Prova de Glauco");
        ag1.setLocal("Fatec Itu, lab 6");

        Agenda ag2 = new Agenda();
        ag2.setId(2);
        Date data2 = sdf.parse("06/11/2024 08:00:00");
        ag2.setData(data2);
        ag2.setDescricao("Prova  de PLA");
        ag2.setLocal("Fatec Itu, lab 4");

        Agenda ag3 = new Agenda();
        ag3.setId(3);
        Date data3 = sdf.parse("10/11/2024 08:00:00");
        ag3.setData(data3);
        ag3.setDescricao("Entrega do projeto e Apresentação");
        ag3.setLocal("Fatec Itu, lab 6");

        agendas.add(ag1);
        agendas.add(ag2);
        agendas.add(ag3);

    }

    @GetMapping("agendas/{id}")
    public ResponseEntity<Agenda> getAgendas(@PathVariable int id) throws ParseException{

        if (id <= agendas.size()) {
            return ResponseEntity.ok().body(agendas.get(id - 1)); //agendas.get(id - 1);
        }
        else{
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("agendas")
    public List<Agenda> getAgendas() throws ParseException {

        return agendas;

    }

}

        
 



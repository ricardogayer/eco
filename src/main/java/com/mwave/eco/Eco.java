package com.mwave.eco;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Eco {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ItemRepository itemRepository;

    @GetMapping
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();

        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);

    }

    @GetMapping("/itens/{chaveDeAcesso}")
    public ResponseEntity<List<Item>> getItens(@PathVariable("chaveDeAcesso") String chaveDeAcesso) {

        List<Item> itens = itemRepository.findBychaveDeAcesso(chaveDeAcesso);

        return new ResponseEntity<List<Item>>(itens, HttpStatus.OK);

    }

}

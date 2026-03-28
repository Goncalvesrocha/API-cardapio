package com.springboot.cardapio.controller;

import com.springboot.cardapio.entity.Cardapio;
import com.springboot.cardapio.service.CardapioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    private CardapioService cardapioService;

    public CardapioController(CardapioService cardapioService){
        this.cardapioService = cardapioService;
    }

    @PostMapping
    public Cardapio create(@RequestBody Cardapio cardapio){
        return cardapioService.create(cardapio);
    }
    @GetMapping
    List<Cardapio>list(){
        return cardapioService.list();
    }
    @PutMapping
    public Cardapio update(@RequestBody Cardapio cardapio){
        return cardapioService.update(cardapio);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        cardapioService.delete(id);
    }
}

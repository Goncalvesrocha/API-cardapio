package com.springboot.cardapio.service;

import com.springboot.cardapio.entity.Cardapio;
import com.springboot.cardapio.repository.CardapioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardapioService {

    private CardapioRepository cardapioRepository;

    public CardapioService(CardapioRepository cardapioRepository){
        this.cardapioRepository = cardapioRepository;
    }

    public Cardapio create(Cardapio item){
        return cardapioRepository.save(item);
    }

    public List<Cardapio> list(){
        return cardapioRepository.findAll();
    }

    public Cardapio update(Cardapio todo){
        return cardapioRepository.save(todo);
    }
    public void delete(Long id){
       cardapioRepository.deleteById(id);
    }
}

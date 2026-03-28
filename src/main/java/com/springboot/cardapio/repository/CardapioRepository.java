package com.springboot.cardapio.repository;

import com.springboot.cardapio.entity.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

}

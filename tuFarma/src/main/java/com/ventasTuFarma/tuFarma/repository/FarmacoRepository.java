package com.ventasTuFarma.tuFarma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventasTuFarma.tuFarma.model.Farmaco;

@Repository
public interface FarmacoRepository extends JpaRepository<Farmaco, Long> {

}

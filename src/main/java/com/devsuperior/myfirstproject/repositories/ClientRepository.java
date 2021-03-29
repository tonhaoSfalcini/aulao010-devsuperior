package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.Client;
import com.devsuperior.myfirstproject.entities.Product;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

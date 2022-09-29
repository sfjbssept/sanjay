package com.flightadmin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightadmin.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>  {

}
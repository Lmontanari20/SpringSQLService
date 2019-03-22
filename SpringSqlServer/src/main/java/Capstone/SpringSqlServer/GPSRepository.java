package Capstone.SpringSqlServer;

import org.springframework.data.repository.CrudRepository;

import Capstone.SpringSqlServer.GPS;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GPSRepository extends  CrudRepository<GPS, Integer> {

}

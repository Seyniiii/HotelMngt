package com.spring.hotelmngt.repo;

import com.spring.hotelmngt.model.Warden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardenRepo extends JpaRepository<Warden,Long> {

}

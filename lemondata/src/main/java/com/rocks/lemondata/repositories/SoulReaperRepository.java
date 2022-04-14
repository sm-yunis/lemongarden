package com.rocks.lemondata.repositories;

import com.rocks.lemondata.entities.SoulReaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoulReaperRepository extends JpaRepository<SoulReaper,Long> {
    SoulReaper findByName(String name);
}

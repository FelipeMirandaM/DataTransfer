package com.eve.project.datatransfer.repository;

import com.eve.project.datatransfer.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {


}

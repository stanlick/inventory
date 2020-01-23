package com.oreillyauto.rest.inventory.repository;

import com.oreillyauto.rest.inventory.domain.InventoryItem;
import org.springframework.data.repository.CrudRepository;

public interface InventoryItemRepository extends CrudRepository<InventoryItem, Long> {
}

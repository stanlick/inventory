package com.oreillyauto.rest.inventory;

import com.oreillyauto.rest.inventory.domain.InventoryItem;
import com.oreillyauto.rest.inventory.repository.InventoryItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DataJpaTest
public class InventoryApplicationTests {

	@Autowired
	private InventoryItemRepository userRepository;

	@Test
	public void whenCalledSave_thenCorrectNumberOfUsers() {
		userRepository.save(new InventoryItem("Bob", "bob@domain.com"));
		List<InventoryItem> users = (List<InventoryItem>) userRepository.findAll();

		assertThat(users.size()).isEqualTo(1);
	}
}
package com.oreillyauto.rest.inventory.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "item_master")
public class BarCode {

    public BarCode(String a, String b) {
    }
}

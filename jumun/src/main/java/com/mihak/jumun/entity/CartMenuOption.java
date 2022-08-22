package com.mihak.jumun.entity;

import javax.persistence.*;

@Entity
public class CartMenuOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CART_MENUOPTION_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MENUOPTION_ID")
    private MenuOption menuOption;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CART_ID")
    private Cart cart;
}
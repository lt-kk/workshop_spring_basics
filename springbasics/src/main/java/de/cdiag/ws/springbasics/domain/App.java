package de.cdiag.ws.springbasics.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class App {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String name;
    @Basic
    private String url;
}

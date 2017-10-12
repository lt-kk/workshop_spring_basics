package de.cdiag.ws.springbasics.domain;

import lombok.Data;

import javax.persistence.*;

@Data
public class App {
    private Long id;
    private String name;
    private String url;
}

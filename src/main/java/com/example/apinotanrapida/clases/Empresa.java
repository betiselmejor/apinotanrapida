package com.example.apinotanrapida.clases;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Empresa {

    @Id
    private String CIF;
    private long id;

    private String nom;
    private String adresa;

    @OneToMany(mappedBy = "empresa")
    private List<Alumne> alumnes;

    public Empresa(String CIF, long id, String nom, String adresa, List<Alumne> alumnes) {
        this.CIF = CIF;
        this.id = id;
        this.nom = nom;
        this.adresa = adresa;
        this.alumnes = alumnes;
    }

    public Empresa() {
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}

package com.example.apinotanrapida.clases;

import jakarta.persistence.*;

@Entity
public class Alumne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String cognom;
    private String cicle;
    private String modalitat;
    private String estat;

    @ManyToOne
    private Empresa empresa;

    public Alumne() {
    }

    public Alumne(long id, String nom, String cognom, String cicle, String modalitat, String estat, Empresa empresa) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.cicle = cicle;
        this.modalitat = modalitat;
        this.estat = estat;
        this.empresa = empresa;
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

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public String getModalitat() {
        return modalitat;
    }

    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}

package org.gestion.tp3.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etudiant {
    @Id
    private String code;
    private String nom;
    private String ville;
    private int age;

    public Etudiant() {
    }

    public Etudiant(String code, String nom, String ville, int age) {
        super();
        this.code = code;
        this.nom = nom;
        this.ville = ville;
        this.age = age;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
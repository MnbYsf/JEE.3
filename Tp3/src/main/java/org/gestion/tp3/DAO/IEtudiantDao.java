package org.gestion.tp3.DAO;


import org.gestion.tp3.domain.Etudiant;

import java.util.List;

public interface IEtudiantDao {
    void add(Etudiant e);
    void delete(String code);

    List<Etudiant> findAll();
    void update(Etudiant e);
    List<Etudiant> findByVille(String v);
    Etudiant findByCode(String c);
}
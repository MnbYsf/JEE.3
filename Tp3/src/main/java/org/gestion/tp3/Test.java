package org.gestion.tp3;

import org.gestion.tp3.DAO.EtudiantDaoMySQL;
import org.gestion.tp3.DAO.IEtudiantDao;
import org.gestion.tp3.domain.Etudiant;

public class Test {
    public static void main(String[] args) {
        IEtudiantDao dao= new EtudiantDaoMySQL();
        dao.add(new Etudiant("A1", "nom1", "ville1", 20));
        dao.add(new Etudiant("A2", "nom3", "ville2", 19));
        dao.add(new Etudiant("11", "nom2", "ville3", 22));
        for(Etudiant e: dao.findAll()) System.out.println(e);
        IEtudiantDao dao1= new EtudiantDaoMySQL();
        dao1.add(new Etudiant("C1", "nom5", "ville5", 20));
        System.out.println("------------------------------");
        for(Etudiant e: dao1.findAll()) System.out.println(e);
        dao.delete("A2");
        System.out.println("------------------------------");
        for(Etudiant e: dao1.findAll()) System.out.println(e);
        System.out.println(dao.findByCode("A1"));
    }
}
package org.example.presentation;

import org.example.Metier.MetierIMplV1;
import org.example.dao.DaoImpl;

public class presentationStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierIMplV1 metier = new MetierIMplV1(dao);
        System.out.println(metier.calcul());
    }
}

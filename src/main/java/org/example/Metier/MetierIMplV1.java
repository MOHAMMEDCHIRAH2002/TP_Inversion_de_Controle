package org.example.Metier;

import org.example.dao.IDoa;

public class MetierIMplV1 implements IMetier{

    // instanciation statique
    private IDoa idao;

    public MetierIMplV1(IDoa idao) {
        this.idao = idao;
    }

    @Override
    public double calcul() {
        return idao.getData();
    }
}

package org.example.presentation;

import org.example.Metier.IMetier;
import org.example.dao.IDoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class presentationDynamque {

    public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDoa dao =(IDoa) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        System.out.println(metierClassName);
        Class cMetier = Class.forName(metierClassName);
        System.out.println(cMetier);
        IMetier metier = (IMetier) cMetier.getConstructor(IDoa.class).newInstance(dao);

        System.out.println("end "+metier.calcul());

    }
}

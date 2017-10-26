/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.singleton;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Magazyn {

    private static Magazyn instance = null;
    private ArrayList<Przedmiot> spisPrzedmiotow;

    private Magazyn() {
        spisPrzedmiotow = new ArrayList<Przedmiot>();
    }

    public static synchronized Magazyn wydajMagazyn() {
        if (instance == null) {
            instance = new Magazyn();
            return instance;
        }
        System.out.println("Magazyn istnieje");
        return instance;
    }

    public void dodajDoSpisu(Przedmiot przedmiot) {
        spisPrzedmiotow.add(przedmiot);
    }

    public double pobierzWartoscPoOpodatkowaniu(StrategiaOpodatkowania strategiaOpodatkowania) {
        double wartoscCalkowita = 0;
        for (Przedmiot przedmiot : spisPrzedmiotow) {
            wartoscCalkowita += przedmiot.okreslWartosc();
        }
        return wartoscCalkowita - wartoscCalkowita * strategiaOpodatkowania.wykonajObliczeniaOpodatkowania(wartoscCalkowita);
    }
}

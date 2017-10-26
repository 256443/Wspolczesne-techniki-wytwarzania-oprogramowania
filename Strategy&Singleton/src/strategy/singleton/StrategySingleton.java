/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.singleton;

/**
 *
 * @author student
 */
public class StrategySingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Magazyn magazyn = Magazyn.wydajMagazyn();
        Podatek podatekLiniowy = new PodatekLiniowy();
        Podatek podatekProgresywny = new PodatekProgresywny();
        
        StrategiaOpodatkowania opodatkowanie =  new StrategiaOpodatkowania(podatekLiniowy);
//        
//        magazyn.dodajDoSpisu(new Ksiazka(2000, 41));
//        magazyn.dodajDoSpisu(new Ksiazka(2003, 789));
//        magazyn.dodajDoSpisu(new Rzezba(13, 1780));
//        magazyn.dodajDoSpisu(new Obraz(1410));
  
        magazyn.dodajDoSpisu( new Ksiazka(1999,2) ); //rok, nr wydania
        magazyn.dodajDoSpisu( new Ksiazka(2006,3) ); //rok, nr wydania
        magazyn.dodajDoSpisu( new Obraz(1800));
        magazyn.dodajDoSpisu( new Obraz(1900));
        magazyn.dodajDoSpisu( new Rzezba(3,1500));
        magazyn.dodajDoSpisu( new Rzezba(5,900));
        System.out.println(magazyn.pobierzWartoscPoOpodatkowaniu(opodatkowanie));
    }
    
}

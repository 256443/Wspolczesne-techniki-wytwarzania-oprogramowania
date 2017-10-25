/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie5;

/**
 *
 * @author PrzemysławAntoszek
 */
public class Klucz {
    private String nazwa;
    private String skrot;

    public Klucz(String nazwa, String skrot) {
        this.nazwa = nazwa;
        this.skrot = skrot;
    }

    
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import static employe.ARisque.PRIME;

/**
 *
 * @author PC-Costomer
 */
class TechnARisque extends Technicien implements ARisque {

    public TechnARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
    }

    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}

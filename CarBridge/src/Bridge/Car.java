/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author ASUS PC
 */
public abstract class Car {

    protected Workshop workShop1;
    protected Workshop workShop2;
    protected Workshop workShop3;
    protected Workshop workShop4;

    protected Car(Workshop workShop1, Workshop workShop2, Workshop workShop3, Workshop workShop4) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
        this.workShop3 = workShop3;
        this.workShop4 = workShop4;
    }

    abstract public void production_house();
}

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
public class Ferrari extends Car {

    public Ferrari(Workshop workShop1, Workshop workShop2, Workshop workShop3, Workshop workShop4) {
        super(workShop1, workShop2, workShop3, workShop4);
    }

    @Override
    public void production_house() {
        System.out.print("-Ferrari Car:");
        workShop1.work();
        workShop2.work();
        workShop3.work();
        workShop4.work();
    }

}
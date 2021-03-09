
package edu.mta.demo.ex1;

public class KiemTra {

    
    public static void main(String[] args) {
        HinhTron htron = new HinhTron();
        htron.setBk(1);
        System.out.println("Dien tich hinh tron la: "+htron.dt());
        System.out.println("Xau ky tu: "+ htron.toString());
        
        System.out.println("----------------------------------------------");
        HinhTru htru = new HinhTru();
        htru.setCao(1);
        System.out.println("The tich hinh tru voi ban kinh "+htron.getBk()+" la: "+htru.thetich());
        System.out.println("Xau ky tu: "+ htru.toString());
      
                
    }
    
}

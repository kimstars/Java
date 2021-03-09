
package edu.mta.demo.ex1;

import static java.lang.Math.pow;

public class HinhTron {
    public double bk;

    public HinhTron(double bk) {
        this.bk = bk;
    }

    public HinhTron() {
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }
    
    public double dt()
    {
        return (float) (3.14*pow(getBk(),2));
    }
    @Override
    public String toString()
    {
        return  +getBk()+" ";
    }
}

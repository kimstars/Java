
package edu.mta.demo.ex1;

import static java.lang.Math.pow;

public class HinhTron {
    public float bk;

    public HinhTron(float bk) {
        this.bk = bk;
    }

    public HinhTron() {
    }

    public float getBk() {
        return bk;
    }

    public void setBk(float bk) {
        this.bk = bk;
    }
    
    public float dt()
    {
        return (float) (3.14*pow(getBk(),2));
    }
    @Override
    public String toString()
    {
        return  +getBk()+" ";
    }
}

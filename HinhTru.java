//😗 ngon r cái file hình tròn chỉ gợi ý chỉnh z
package edu.mta.demo.ex1;
public class HinhTru extends HinhTron {

    private float cao;

    public HinhTru() {
    }

    public HinhTru( float bk, float cao) {
        super(bk);
        this.cao = cao;
        }
    
    public float getCao() {
        return cao;
    }
    public void setCao(float cao) {
        this.cao = cao;
    }
    public float thetich()
    {
        return super.dt()*getCao();
    }
    @Override
    public String toString()
    {
        return getCao()+" ";
    }
}

// Victor Jesus Maximo Abundio
// Ing. Sistemas Computacionales
// Tec Campus Vallarta
// 28/Octubre/2020

package clases;

/**
 *
 * @author victo
 */
public class Cuenta {
    private String strNombre;
    private String strPicture;

    public Cuenta(String strNombre, String strPicture) {
        this.strNombre = strNombre;
        this.strPicture = strPicture;
        this.dblSaldo = 1000;
    }
        
    public String getStrPicture() {
        return strPicture;
    }

    public void setStrPicture(String strPicture) {
        this.strPicture = strPicture;
    }
    private double dblSaldo;
    
    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public double getDblSaldo() {
        return dblSaldo;
    }

    public void setDblSaldo(double dblSaldo) {
        this.dblSaldo = dblSaldo;
    }
     
}

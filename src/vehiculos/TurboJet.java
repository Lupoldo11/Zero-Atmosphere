package vehiculos;

import utils.Text;

/**
 *
 * @author Ana
 */
public class TurboJet {

    private int potencia;
    private int gastoCarburante;
    private String codigo;

    public TurboJet(boolean moto) {
        this.potencia=100;
        if (moto){
            this.gastoCarburante=6;
        } else {
            this.gastoCarburante=12;
        }
        this.codigo = utils.Codigo.generarTurboJet();
    }

    public int getPotencia() {
        return potencia;
    }
    private void potenciaNave(){
        this.potencia=1000;
    }

    public int getGastoCarburante() {
        return gastoCarburante;
    }
    public void gastoNave(){
        this.gastoCarburante=60;
    }

    public String getCodigo() {
        return codigo;
    }

    //ARREGLAR
    @Override
    public String toString() {
        return Text.turbojet + Text.potencia + potencia + Text.str_gasto_carburante + gastoCarburante + Text.str_codigo + codigo + '}';
    }

    //Metodo static para generarTurboJets
    public static TurboJet creadorMotor (boolean moto){
        TurboJet ejemplo = new TurboJet(moto);
        return ejemplo;
    }
    
    public static TurboJet motorNave(){
        TurboJet nave = new TurboJet(false);
        nave.potenciaNave();
        nave.gastoNave();
        return nave;
    }
}
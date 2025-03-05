package vehiculos;
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

    public int getGastoCarburante() {
        return gastoCarburante;
    }

    public String getCodigo() {
        return codigo;
    }

    //ARREGLAR
    @Override
    public String toString() {
        return "TurboJet{" + "potencia=" + potencia + ", gastoCarburante=" + gastoCarburante + ", codigo=" + codigo + '}';
    }

    //Metodo static para generarTurboJets
    public static TurboJet creadorMotor (boolean moto){
        TurboJet ejemplo = new TurboJet(moto);
        return ejemplo;
    }
}
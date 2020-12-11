package ExerciciCotxe;/*
Hecho dia vie. 11/12/2020
Creado por: Juanma
Paquete: ExerciciCotxe
Descripcion:
*/

public class CotxeSegonaPart_JuanManuel_Fernandez extends Cotxe_JuanManuel_Fernandez{
    protected CanviMarxesAutomatic marxaAutomatic;
    protected CanviMarxesManual marxaManual;

    public CotxeSegonaPart_JuanManuel_Fernandez(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatCotxe, CanviMarxesAutomatic marxaAutomatic, CanviMarxesManual marxaManual){
        super(marca, model, tipuscanvi, estatCotxe);
        if (tipuscanvi == TipusCanvi.CanviAutomatic){
            this.marxaAutomatic = marxaAutomatic;
            this.marxaManual = null;
        }
        else {
            this.marxaAutomatic = null;
            this.marxaManual = marxaManual;
        }
    }

    public void canviarMarxesAutomatic(char marxa) {
        //************
        //------------CANVI AUTOMATIC
        //************
        if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.R && marxa == '+') {
            this.marxaAutomatic = CanviMarxesAutomatic.N;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.N && marxa == '+') {
            this.marxaAutomatic = CanviMarxesAutomatic.F;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.F && marxa == '-') {
            this.marxaAutomatic = CanviMarxesAutomatic.N;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.N && marxa == '-') {
            this.marxaAutomatic = CanviMarxesAutomatic.R;
        }
    }

    public void canviarMarxesManual(char marxa) {
        //************
        //------------CANVI MANUAL
        //************
        if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.R && marxa == '+') {
            this.marxaManual = CanviMarxesManual.N;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.N && marxa == '+') {
            this.marxaManual = CanviMarxesManual.Primera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Primera && marxa == '+') {
            this.marxaManual = CanviMarxesManual.Segona;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Segona && marxa == '+') {
            this.marxaManual = CanviMarxesManual.Tercera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Tercera && marxa == '+') {
            this.marxaManual = CanviMarxesManual.Quarta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Quarta && marxa == '+') {
            this.marxaManual = CanviMarxesManual.Quinta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Quinta && marxa == '+') {
            this.marxaManual = CanviMarxesManual.Sexta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Sexta && marxa == '-') {
            this.marxaManual = CanviMarxesManual.Quinta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Quinta && marxa == '-') {
            this.marxaManual = CanviMarxesManual.Quarta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Quarta && marxa == '-') {
            this.marxaManual = CanviMarxesManual.Tercera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Tercera && marxa == '-') {
            this.marxaManual = CanviMarxesManual.Segona;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Segona && marxa == '-') {
            this.marxaManual = CanviMarxesManual.Primera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.Primera && marxa == '-') {
            this.marxaManual = CanviMarxesManual.N;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviMarxesManual.N && marxa == '-') {
            this.marxaManual = CanviMarxesManual.R;
        }
    }

    public CanviMarxesManual getMarxaManual(){
        return marxaManual;
    }

    public CanviMarxesAutomatic getMarxaAutomatic(){
        return marxaAutomatic;
    }
}

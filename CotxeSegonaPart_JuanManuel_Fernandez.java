package ExerciciCotxe;/*
Hecho dia vie. 11/12/2020
Creado por: Juanma
Paquete: ExerciciCotxe
Descripcion: A partir dels fitxers i enunciat de l'exercici PRU03E02, heu de crear una altra classe Cotxe fent
una subclasse de la classe que féreu a PRU03E02, seguint la mateixa nomenclatura (CotxeSegonaPart_nom_llinatge),
i que incorpori els mètodes CanviarMarxaAutomatic i CanviarMarxaManual. Els mètodes només poden funcionar si el
cotxe és automàtic o manual, respectivament.
Per canviar les marxes tant en un mètode com a l’altre, haureu de passar un char com a paràmetre. Concretament
‘+’ o ‘-’ per indicar pujar o baixar marxa respectivament.
El canvi automàtic ha d’implementar les marxes F,N,R i el manual R,N,1,2,3,4,5,6
Els canvis seran seqüencials (no podem passar, per exemple, de 1 a 4 directament) i les marxes els heu d’implementar
com a enum, tal i com vérem a l’exercici anterior.
*/

public class CotxeSegonaPart_JuanManuel_Fernandez extends Cotxe_JuanManuel_Fernandez{
    protected CanviMarxesAutomatic marxaAutomatic;
    protected CanviMarxesManual marxaManual;
    protected Cinturo cinturo;

    public CotxeSegonaPart_JuanManuel_Fernandez(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatCotxe, CanviMarxesAutomatic marxaAutomatic, CanviMarxesManual marxaManual, Cinturo cinturo){
        super(marca, model, tipuscanvi, estatCotxe);
        this.cinturo = cinturo;
        if (tipuscanvi == TipusCanvi.CanviAutomatic){
            this.marxaAutomatic = marxaAutomatic;
            this.marxaManual = null;
        }
        else {
            this.marxaAutomatic = null;
            this.marxaManual = marxaManual;
        }
    }

    public void canviarMarxaAutomatic(char marxa) throws Exception {
        //************
        //------------CANVI AUTOMATIC
        //************
        //Feim una seria de IF per a recorrer la l'enum del tipus de marxa en aquest cas
        //del canvi manual, pujant i baixant passant un + o - de parametre
        if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.R && marxa == '+') {
            this.marxaAutomatic = CanviMarxesAutomatic.N;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.N && marxa == '+') {
            this.marxaAutomatic = CanviMarxesAutomatic.F;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.F && marxa == '-') {
            this.marxaAutomatic = CanviMarxesAutomatic.N;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviMarxesAutomatic.N && marxa == '-') {
            this.marxaAutomatic = CanviMarxesAutomatic.R;
        }
        else {
            throw new Exception("Marxa no identificada");
        }
    }

    public void canviarMarxaManual(char marxa) throws Exception {
        //************
        //------------CANVI MANUAL
        //************
        //Feim una serie de IF per a recorrer la l'enum del tipus de marxa en aquest cas
        //del canvi manual, pujant i baixant passant un + o - per parametre
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
        else {
            throw new Exception("Marxa no identificada");
        }
    }

    public void fermarCinturo() throws Exception{
        if (this.cinturo == Cinturo.NoFermat){
            this.cinturo = Cinturo.Fermat;
        }
        else {
            throw new Exception("Ja tens el cinturo fermat");
        }
    }

    public Cinturo getCinturo(){
        return this.cinturo;
    }

    public void desfermarCinturo() throws Exception{
        if (this.cinturo == Cinturo.Fermat){
            this.cinturo = Cinturo.NoFermat;
        }
        else {
            throw new Exception("Ja tens el cinturo desfermat");
        }
    }

    public CanviMarxesManual getMarxaManual(){
        return marxaManual;
    }

    public CanviMarxesAutomatic getMarxaAutomatic(){
        return marxaAutomatic;
    }
}

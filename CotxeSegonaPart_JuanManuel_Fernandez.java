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

enum CanviMarxesAutomatic {
    F, N, R
}

enum CanviMarxesManual {
    R, N, Primera, Segona, Tercera, Quarta, Quinta, Sexta
}

public class CotxeSegonaPart_JuanManuel_Fernandez extends Cotxe_JuanManuel_Fernandez{
    //Atributos de la clase CotxeSegonaPart_JuanManuel_Fernandez
    protected Cinturo cinturo;
    protected int contadorAutomatic = 1;
    protected int contadorManual = 1;
    protected CanviMarxesAutomatic marxesAutomatic = CanviMarxesAutomatic.N;
    protected CanviMarxesManual marxesManual = CanviMarxesManual.N;

    public CotxeSegonaPart_JuanManuel_Fernandez(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatCotxe, CanviMarxesAutomatic marxaAutomatic, CanviMarxesManual marxaManual, Cinturo cinturo){
        super(marca, model, tipuscanvi, estatCotxe);
        this.cinturo = cinturo;
    }

    //Metodo para subir y bajar marchas en los coches automaticos.
    //Comprobaciones de coche en marcha, comprobacion del tipo de coche y comprobaciones marcha minima y maxima.
    public void canviarMarxaAutomatic(char marxa) throws Exception {
        if (estatCotxe == EstatsMotorCotxe.EnMarxa){
            if (this.tipuscanvi == TipusCanvi.CanviAutomatic){
                CanviMarxesAutomatic[] marxaAutomatic = {CanviMarxesAutomatic.R, CanviMarxesAutomatic.N, CanviMarxesAutomatic.F};
                if (marxa == '+'){
                    if (getMarxaAutomatic() == marxaAutomatic[marxaAutomatic.length - 1])
                    throw new Exception("Marcha automatica maxima.");
                    else {
                        this.contadorAutomatic++;
                        this.marxesAutomatic = marxaAutomatic[this.contadorAutomatic];
                    }
                }
                if (marxa == '-'){
                    if (getMarxaAutomatic() == marxaAutomatic[0])
                    throw new Exception("Marcha automatica minima.");
                    else {
                        this.contadorAutomatic--;
                        this.marxesAutomatic = marxaAutomatic[this.contadorAutomatic];
                    }
                }
            } else {
                throw new Exception("El coche no es automatico.");
            }
        } else {
            throw new Exception("El coche no esta en marcha.");
        }
    }

    //Metodo para subir y bajar marchas en los coches manuales.
    //linea 30
    public void canviarMarxaManual(char marxa) throws Exception {
        if (estatCotxe == EstatsMotorCotxe.EnMarxa){
            if (this.tipuscanvi == TipusCanvi.CanviManual){
                CanviMarxesManual[] marxaManual = {CanviMarxesManual.R, CanviMarxesManual.N, CanviMarxesManual.Primera, CanviMarxesManual.Segona, CanviMarxesManual.Tercera, CanviMarxesManual.Quarta, CanviMarxesManual.Quinta, CanviMarxesManual.Sexta};
                if (marxa == '+'){
                    if (getMarxaManual() == marxaManual[marxaManual.length - 1])
                        throw new Exception("Marcha manual maxima.");
                    else {
                        this.contadorManual++;
                        this.marxesManual = marxaManual[this.contadorManual];
                    }
                }
                if (marxa == '-'){
                    if (getMarxaManual() == marxaManual[0])
                        throw new Exception("Marcha manual minima.");
                    else {
                        this.contadorManual--;
                        this.marxesManual = marxaManual[this.contadorManual];
                    }
                }
            } else {
                throw new Exception("El coche no es manual.");
            }
        } else {
            throw new Exception("El coche no esta en marcha.");
        }
    }

    //Metodo para abrocharnos el cinturon.
    public void fermarCinturo() throws Exception{
        if (this.cinturo == Cinturo.NoFermat){
            this.cinturo = Cinturo.Fermat;
        }
        else {
            throw new Exception("Ja tens el cinturo fermat");
        }
    }

    //getter del cinturon
    public Cinturo getCinturo(){
        return this.cinturo;
    }

    //Metodo para desabrocharnos el cinturon
    public void desfermarCinturo() throws Exception{
        if (this.cinturo == Cinturo.Fermat){
            this.cinturo = Cinturo.NoFermat;
        }
        else {
            throw new Exception("Ja tens el cinturo desfermat");
        }
    }

    //Getter de la marcha manual en la que estamos.
    public CanviMarxesManual getMarxaManual(){
        return this.marxesManual;
    }

    //Getter de la marcha automatica en la que estamos
    public CanviMarxesAutomatic getMarxaAutomatic(){
        return this.marxesAutomatic;
    }
}

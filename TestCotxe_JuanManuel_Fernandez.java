package ExerciciCotxe;/*
Hecho dia dom. 06/12/2020
Creado por: Juanma
Paquete: ExerciciCotxe
Descripcion:
*/

public class TestCotxe_JuanManuel_Fernandez {
    public static void main(String[] args) {
        /*
        -------PARTE 1
        Cotxe_JuanManuel_Fernandez c1 = new Cotxe_JuanManuel_Fernandez("Wolkswagen", "Golf R", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.Aturat);
        System.out.println(c1.comprovaMotor());
        System.out.println(c1.marca);
        System.out.println(c1.model);
        System.out.println(c1.tipuscanvi);
        try {
            //System.out.println(c1.estatCotxe);
            c1.arrancarMotor();
            System.out.println(c1.getRevolucions());
            //System.out.println(c1.estatCotxe);
            c1.aturarMotor();
            System.out.println(c1.getRevolucions());
            //System.out.println(c1.estatCotxe);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }*/

        //-------PARTE 2
        CotxeSegonaPart_JuanManuel_Fernandez c2 = new CotxeSegonaPart_JuanManuel_Fernandez("Ford", "Focus RS", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.Aturat, CanviMarxesAutomatic.N, CanviMarxesManual.N);
        try {
            System.out.println(c2.getMarxaAutomatic());
            c2.canviarMarxesAutomatic('+');
            System.out.println(c2.getMarxaAutomatic());
            c2.canviarMarxesAutomatic('-');
            System.out.println(c2.getMarxaAutomatic());
            c2.canviarMarxesAutomatic('-');
            System.out.println(c2.getMarxaAutomatic());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        CotxeSegonaPart_JuanManuel_Fernandez c3 = new CotxeSegonaPart_JuanManuel_Fernandez("Ford", "Mustang", TipusCanvi.CanviManual, EstatsMotorCotxe.Aturat, CanviMarxesAutomatic.N, CanviMarxesManual.N);
        try {
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('+');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('-');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('-');
            System.out.println(c3.getMarxaManual());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

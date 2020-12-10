package ExerciciCotxe;/*
Hecho dia dom. 06/12/2020
Creado por: Juanma
Paquete: ExerciciCotxe
Descripcion:
*/

public class TestCotxe_JuanManuel_Fernandez {
    public static void main(String[] args) {
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
        }
    }
}

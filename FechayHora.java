
/**
 * Write a description of class FechayHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechayHora
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres day;
    private DisplayDosCaracteres month;
    private DisplayDosCaracteres year;
    private int minuts;
    private int hours;
    /**
     * Constructor for objects of class FechayHora
     */
    public FechayHora()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(2900);
        minuts = 00;
        hours = 00;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void avanzarFechaHora()
    {
        minuts = minuts +1;
        if(minuts == 60){
            hours= hours + 1;
            if(hours == 24){
                hours = 0;
            }    
        }
        day.incrementaValorAlmacenado();
        if(day.getValorAlmacenado() == 1){
            month.incrementaValorAlmacenado();
            if(month.getValorAlmacenado() == 1){
                year.incrementaValorAlmacenado();
            }    
        }
    }
}

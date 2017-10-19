/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package journaldev.structural.adapter;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 18, 2017 10:19:37 PM
 * 
 * Class adapter pattern
 */
public class SocketAdapterImpl extends Socket implements SocketAdaptor{

    @Override
    public Volt get120Volt() {
       return  getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolts(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolts(v, 40);
    }
    

    private Volt convertVolts(Volt unUsableVolt,int conversionFactor){
        Volt usableVoltage = new Volt((unUsableVolt.getVolts())/conversionFactor);
        return usableVoltage;
    }
}

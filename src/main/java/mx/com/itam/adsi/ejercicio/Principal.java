package mx.com.itam.adsi.ejercicio;

import org.apache.log4j.Logger;

public class Principal{
  private final static Logger LOG = Logger.getLogger(Principal.class);

  public static void main(String...argv) {
    Principal p = new Principal();
  }
  public boolean seConstruyeConSubcadenas(String source) {
    String original = source;
    String modificado = source;
    String subStr = "";
    int lFinal = source.length()/2;
    int lActual = 1;
    boolean res = false;
    while(lActual <= lFinal && res == false)
    {
	subStr = original.substring(0,lActual);
	System.out.println(subStr);
	modificado = original.replace(subStr, "");
	System.out.println("modificado:" + modificado);
	if(modificado.equals(""))
	{
		res = true;
	}
	lActual++;
    }
    return res;
  }
}

import gnu.io.CommPortIdentifier;

import java.util.Enumeration;

public class SerialCom {
	
	private String[] portas;

	private Enumeration listaDePortas;
	
	public SerialCom(){
        listaDePortas = CommPortIdentifier.getPortIdentifiers();
	}
	
	public String[] obterPortas(){
        return portas;
	}
	
	public void listarPortas(){

        int i = 0;

        portas = new String[10];

        while (listaDePortas.hasMoreElements()) {

            CommPortIdentifier ips = (CommPortIdentifier)listaDePortas.nextElement();

            portas[i] = ips.getName();

            i++;

        }

	}
	
	public boolean PortaExiste(String COMp){

        String temp;

        boolean e = false;

        while (listaDePortas.hasMoreElements()) {

            CommPortIdentifier ips = (CommPortIdentifier)listaDePortas.nextElement();

            temp = ips.getName();

            if (temp.equals(COMp)== true) {

            	e = true;

            }

        }

        return e;

	}

}

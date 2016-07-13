import java.util.Enumeration;


public class TestaSerialCom {

	public static void main(String[] args) {
		
		SerialCom serialCom = new SerialCom();
		serialCom.listarPortas();
		
		String[] portas = serialCom.obterPortas();
		
		for (String porta : portas) {
			System.out.println(porta);
		}

	}

}

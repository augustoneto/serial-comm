
public class TestaLeituraSerial {

	public static void main(String[] args) {
		
		//Iniciando leitura serial

        SerialComLeitura leitura = new SerialComLeitura("COM1", 9600, 0);

        leitura.HabilitarLeitura();

        leitura.ObterIdDaPorta();

        leitura.AbrirPorta();

        leitura.LerDados();
        
        System.out.println(leitura.getPeso());

        //Controle de tempo da leitura aberta na serial

        try {

            Thread.sleep(1000);

        } catch (InterruptedException ex) {

            System.out.println("Erro na Thread: " + ex);

        }

        leitura.FecharCom();

    }

}

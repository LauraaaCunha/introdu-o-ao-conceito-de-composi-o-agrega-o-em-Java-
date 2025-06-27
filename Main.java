
import com.mycompany.composicao.Automovel;
import com.mycompany.composicao.Direcao;
import com.mycompany.composicao.Motor;


public class Main {

    public static void main(String[] args) {
        Direcao direcao1 = new Direcao("branco", 200.00, false);
        Motor motor1 = new Motor(100.00, "Diesel", "modelo");
    
        Automovel automovel1 = new Automovel(motor1, direcao1);
        
        System.out.println(automovel1);
        
        automovel1.getMotor().setPotencia(600.00);
        
        System.out.println(automovel1.toString());

    }
}

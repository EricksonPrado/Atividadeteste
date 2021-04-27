
package imcpoo;

public class Imcpoo {
 public static void main(String[] args) {
     Cliente c1 = new Cliente();
     c1.peso = 70;
     c1.altura = 1.75f;
     c1.sexo = "Feminino";
     c1.calcularImc();
     c1.statusFeminino();
    }
    
}

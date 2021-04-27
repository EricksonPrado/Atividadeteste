
package imcpoo;
public class Cliente {
    float peso;
    float altura;
    String sexo;
    float imc;
    
   void calcularImc()
   {
    imc = peso/(altura*altura);
        System.out.println("O valor de IMC: " + imc);
   }
   /*void diagnosticarStatus()
   {
       if (this.sexo == "Feminino")
       {
           System.out.println("O valor de IMC: ");
           //statusFeminino();
       }
       else
       {
           System.out.println("O valor de IMC: ");
           //statusMasculino();    
       }
   }*/
   void statusMasculino()
   {
    if (imc<20)
        {
            System.out.println("Abaixo do normal");
        }
    if (imc>=17 && imc<25)
        {
            System.out.println("Normal");
        }
    if (imc>=25 && imc<30)
        {
            System.out.println("Obesidade Leve");   
        }
    if (imc>=30 && imc<40)
        {
            System.out.println("Obesidade Moderada");   
        }
    if (imc>40)
        {
            System.out.println("Obesidade Morbida");    
        }
   }
   void statusFeminino()
   {
    if (imc<19)
        {
            System.out.println("Abaixo do normal");
        }
    if (imc>=19 && imc<24)
        {
            System.out.println("Normal");
        }
    if (imc>=24 && imc<29)
        {
            System.out.println("Obesidade Leve");   
        }
    if (imc>=29 && imc<39)
        {
            System.out.println("Obesidade Moderada");   
        }
    if (imc>39)
        {
            System.out.println("Obesidade Morbida");    
        }
   }
}

package AluguelAutomoveis;

public class Main {
    public static void main(String[] args) throws Exception {

        //Locacao locacao = new Locacao(0, true, 0, 0);
        //Locacao lista = new Locacao(0, false, 0, 0);


        Locacao l1 = new Locacao(0, false, 0, 0);
        Locacao l2  = new Locacao(0, false, 0, 0);

        l1.add(l1);
        l2.add(l2);


        l1.setDataInicial(10);
        l1.setDataFinal(15);
        l1.setCodigoDaLocacao(232);
        l1.setSeguro(true);

        l2.setDataInicial(20);
        l2.setDataFinal(30);
        l2.setCodigoDaLocacao(445);
        l2.setSeguro(false);
    
        
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
       
        
    }
}


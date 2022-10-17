public class LocadoraVeiculos {
	public static void main(String[] args) {
        Veiculo lista = new Veiculo();
        Veiculo v1 = new Veiculo("ABC1234");
        Veiculo v2 = new Veiculo("CDA4444");
        lista.add(v1);
        lista.add(v2);
        v1.setPlaca("OOO9999");
        v2.setAno(2022);
        v2.setValorD(50.00);
        
        System.out.println(lista.toString());
	}
}


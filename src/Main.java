import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> arrayNotas = new ArrayList<Double>();
		
		arrayNotas.add(85.0);
		arrayNotas.add(70.0);
		arrayNotas.add(65.0);
		arrayNotas.add(50.0);
		arrayNotas.add(60.0);
		arrayNotas.add(96.0);
		arrayNotas.add(68.0);
		arrayNotas.add(100.0);
		
		Atleta atleta = new Atleta(arrayNotas);
		
		System.out.println(atleta.maiorNota());
		System.out.println(atleta.menorNota());
		
	}

}

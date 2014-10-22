import java.util.ArrayList;


public class Atleta {
	
    private ArrayList<Double> notas;
    private double maiorNumero;
    private double menorNumero;

    public Atleta(ArrayList<Double> notas){
      this.notas=notas;

    }

    public double maiorNota(){
    if (Double.MIN_VALUE < notas.get(0)){
        maiorNumero = notas.get(0);
        for (int i=1; i < 6; i ++){
            if (maiorNumero < notas.get(i)){
                maiorNumero = notas.get(i);
            }
        }
    }
    return maiorNumero;
    }
    public double menorNota(){
     if (Double.MAX_VALUE > notas.get(0)){
         menorNumero = notas.get(0);
         for (int i=1; i < 6; i++){
             if (menorNumero > notas.get(i)){
                 menorNumero = notas.get(i);
             }

         }
     }
        return menorNumero;
     }

    public double media(){
        double soma = 0;
        double media = 0;
        for (int i=0; i < 6; i++){
            soma += notas.get(i);
        }

        return media = (soma - (menorNota()) - (maiorNota()))/4;

    }

    public ArrayList<Double> notasAbaixoDe6(){
        ArrayList<Double> notasAbaixo = new ArrayList<Double>();
        for (int i=0; i <6; i++){
            if (notas.get(i) < 6){
                notasAbaixo.add(notas.get(i));
            }
        }
        return notasAbaixo;
    }	
}

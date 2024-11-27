public class Application{

    public static DiaSemana[] dias= new DiaSemana[10];
    public static void main(String[] args) {
        cargarDias();
        imprimirDiaLaboral();
    }

    public static void cargarDias(){
        DiaSemana [] totalDias =DiaSemana.values();
        int valorRandom=0;
        for (int i = 0; i < dias.length; i++) {
            valorRandom= (int) (Math.random() *7);
            dias[i]=totalDias[valorRandom];
        }
    }
    public static void imprimirDiaLaboral(){
        for (int i = 0; i < dias.length; i++) {
           if(DiaSemana.esDiaLaboral(dias[i])){
            System.out.println(dias[i].name()+" Es laboral");
           }
           else
           System.out.println(dias[i].name()+" No es laboral");
        }
    }
}
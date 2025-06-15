public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso("123", "POO", 3 );

        Estudiante e1 = new Estudiante("Pedro", "pedro@gmail.com", 9);
        Estudiante e2 = new Estudiante("Maria", "maria@gmail.com", 6);
        Estudiante e3 = new Estudiante("Pablo", "pablo@gmail.com", 7);
        Estudiante e4 = new Estudiante("Ramiro", "ramiro@gmail.com", 9);


        curso.inscribir(e1);
        curso.inscribir(e2);
        curso.inscribir(e3);
        curso.inscribir(e4);

        System.out.println("Promedio del grupo: "+ curso.calcularPromedioGrupo());



    }
}

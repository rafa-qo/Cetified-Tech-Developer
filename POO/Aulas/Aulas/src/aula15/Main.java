package aula15;

public class Main {

    public static void main(String[] args) {

        Porto porto1 = new Porto("Porto de Buenos Aires");

        Container container1 = new Container(1,"Desc 1","Brasil",true);
        Container container2 = new Container(2,"Desc 2","Desconhecido",true);
        Container container3 = new Container(3,"Desc 3","Rússia",false);
        Container container4 = new Container(4,"Desc 4","Desconhecido",false);

        porto1.addContainer(container1);
        porto1.addContainer(container2);
        porto1.addContainer(container3);
        porto1.addContainer(container4);

        porto1.calcularQtdeContainers();



    }
}

public class Autodromo {

    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto honda = new Moto();

        jeep.setChassis("1234456");
        jeep.ligar();
        System.out.println(jeep.getChassis());

        honda.setChassis("1357050");
        System.out.println(honda.getChassis());
    }

}

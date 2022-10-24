public class RodarAplicacao {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW serie 1");
        carro1.setCapacidadeTanque(19);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

    }
}

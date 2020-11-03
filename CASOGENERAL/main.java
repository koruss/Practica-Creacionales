class main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Arma arco= fabrica.fabricarArco("Arco Gelido", 1000, 100,5);
        System.out.println(arco.toString());
        
        Arma lanza= fabrica.fabricarLanza("Lanza de Longinius", 500, 200, "Cobra");
        System.out.println(lanza.toString());

        Arma hacha= fabrica.fabricarHacha("StormBreaker", 250, 400);
        System.out.println(hacha.toString());


    }
}
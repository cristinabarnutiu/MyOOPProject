public class Masina {
    String marca;
    int anFabricatie;

    public Masina() {
        marca = "BMW";
        anFabricatie = 2000;
    }

    public Masina(String marca, int anFabricatie) {
        this.marca = marca;
        this.anFabricatie = anFabricatie;
    }

    public int getAnFabricatie(){
        return anFabricatie;
    }


}

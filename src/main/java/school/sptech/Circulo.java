package school.sptech;

public class Circulo extends Figura {

    private Double raio;

    @Override
    public Double calcularArea() {
        return (raio * raio) * Math.PI;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}

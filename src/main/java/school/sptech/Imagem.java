package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private Double soma = 0.0;
    private List<Figura> figuras = new ArrayList<>();

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public void adicionar(Figura figura){
         figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        for (Figura figura : figuras) {
            soma += figura.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> maiorQue20s = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20){
                maiorQue20s.add(figura);
            }
        }
        return maiorQue20s;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                quadrados.add(figura);
            }
        }

        return quadrados;
    }

}

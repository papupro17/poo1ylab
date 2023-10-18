package _p105_PuntoTriangulo;

public class Triangulo {
    private Punto V1;
    private Punto V2;
    private Punto V3;
    
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
    }
    public Punto getV1() {
        return V1;
    }
    public void setV1(Punto v1) {
        V1 = v1;
    }
    public Punto getV2() {
        return V2;
    }
    public void setV2(Punto v2) {
        this.V2 = v2;
    }
    public Punto getV3() {
        return V3;
    }
    public void setV3(Punto v3) {
        this.V3 = v3;
    }

    public double getPerimetro() {
        double distanciaV1V2 = V1.getDistancia(V2);
        double distanciaV2V3 = V2.getDistancia(V3);
        double distanciaV3V1 = V3.getDistancia(V1);
        return distanciaV1V2 + distanciaV2V3 + distanciaV3V1;

    }

    public String getTipo() {
        double distanciaV1V2 = V1.getDistancia(V2);
        double distanciaV2V3 = V2.getDistancia(V3);
        double distanciaV3V1 = V3.getDistancia(V1);

        if (distanciaV1V2 == distanciaV2V3 && distanciaV2V3 == distanciaV3V1) {
            return "Equilatero";
        } else if (distanciaV1V2 == distanciaV2V3 || distanciaV2V3 == distanciaV3V1 || distanciaV3V1 == distanciaV1V2) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
    @Override
    public String toString() {
        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]";
    }
}
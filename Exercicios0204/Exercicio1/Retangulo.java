public class Retangulo extends TwoDShape {
    public boolean checkQuadrado() {
        if(getAltura() == getLargura())
            return true;
        else
            return false;
    }

    public double area() {
        return getLargura() * getAltura();
    }
}

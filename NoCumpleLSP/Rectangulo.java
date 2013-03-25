public class Rectangulo {
  protected int alto;
  protected int ancho;

  public int getAncho() {
    return ancho;
  }
  public int getAlto() {
    return alto;
  }
  public void  setAncho(int x) {
    ancho = x;
  }
  public void setAlto(int h) {
    alto = h;
  }

  public int getArea() {
    return getAlto()*getAncho();
  }
}
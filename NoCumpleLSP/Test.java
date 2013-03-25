public class Test {
  public void testCalculoAreaRectangulo() {
    testAreaFiguraRectangular(new Rectangulo());
  }
  public void testCalculoAreaCuadrado() {
    testAreaFiguraRectangular(new Cuadrado());
  }
  public void testAreaFiguraRectangular(Rectangulo rect) {
    rect.setAlto(10);
    rect.setAncho(2);
    if(rect.getArea() != 20)
      System.out.println("Esto no puede ser " + rect.getAncho() + "*" + rect.getAlto() +"!=20");
  }
  public static void main(String args[]) {
    Test test1 = new Test();
    Test test2 = new Test();
    test2.testCalculoAreaCuadrado();
    test1.testCalculoAreaRectangulo();
  }
}
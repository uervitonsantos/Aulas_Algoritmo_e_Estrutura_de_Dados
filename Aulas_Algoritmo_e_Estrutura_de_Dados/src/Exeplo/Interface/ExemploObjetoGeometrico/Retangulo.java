/**
 * 
 */
package Exeplo.Interface.ExemploObjetoGeometrico;

/**
 * @author uerviton.santos
 *
 */
public class Retangulo implements ObjetoGeometrico{
	
	private double lado;
	
	public double getLAdo() {
		return lado;
	}
	
	public void setLado(double lado) {
        this.lado = lado;
    }

	@Override
	public double getPerimeter() {
		double perimetro = 0;
		
		perimetro = lado * 4;
		return perimetro;
	}

	@Override
	public double getArea() {
		double area = 0;
		area = lado * lado;
		
		return area;
	}

	@Override
	public double getLargura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return 0;
	}

}

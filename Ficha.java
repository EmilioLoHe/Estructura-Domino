public class implements Comparable<Ficha>{
  private int lado1, lado2;
	public Ficha(int lado1, int lado2)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public int getLado1()
	{
		return lado1;
	}

	public int getLado2()
	{
		return lado2;
	}
	
	public boolean esMenor(Ficha t){
		
		if(this.getLado1() < t.getLado1() && this.getLado2() < t.getLado2()
		|| this.getLado1() == t.getLado1() && this.getLado2() < t.getLado2())
			return true;
		else
			return false;
	}
	
	public boolean esMayor(Ficha t){
		
		if(this.getLado1() > t.getLado1() && this.getLado2() > t.getLado2()
		|| this.getLado1() == t.getLado1() && this.getLado2() > t.getLado2())
			return true;
		else
			return false;
	}
	
	public boolean esIgual(Ficha t){
		
		if(this.getLado1() == t.getLado1() && this.getLado2() == t.getLado2()
		|| this.getLado1() == t.getLado2() && this.getLado2() == t.getLado1())
		
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return lado1 + " / " + lado2;
	}
}

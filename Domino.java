public class Domino{
  private Ficha[] fichas;

	public Domino()
	{
		fichas = new Ficha[28];

		int k = 0;
		for(int i = 0; i <= 6; i++)
			for(int j = 0; j <= i; j++, k++)
				fichas[k] = new Ficha(j, i);
	}
	
	public Ficha getFicha(int lado1, int lado2)
	{
		if(lado1 <= 6 && lado1 >= 0 && lado2 <= 6 && lado2 >= 0)
		{
			for(Ficha f : fichas)
			{
				if(f.getLado1() == lado1 && f.getLado2() == lado2 ||
					f.getLado2() == lado1 && f.getLado1() == lado2)
				{
					return f;
				}
			}
		}
		return null;
	}
}

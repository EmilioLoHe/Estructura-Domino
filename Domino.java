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
}

package at.bals.patterns.matura.example;

public class MyTreeSchool {
	public static void main(String[] args) {
		IFertStrategy fs1 = new TGStrategy();
		IFertStrategy fs2 = new SGStrategy();
		Conifer co = new Conifer(30, 1, fs2);
		BroadLeaf bl = new BroadLeaf(20, 2, fs1);

		Area a1 = new Area();
		a1.addTree(co);
		a1.addTree(bl);

		System.out
				.println(bl.getMaxDiameter() + "m Breit - " + bl.getMaxHeight()
						+ "m Hoch" + ", Dünger = " + bl.getAmount());
		System.out
				.println(co.getMaxDiameter() + "m Breit - " + co.getMaxHeight()
						+ "m Hoch" + ", Dünger = " + co.getAmount());
		System.out.println("Area: " + a1.getSum());
	}
}

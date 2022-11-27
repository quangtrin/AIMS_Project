package lopHocAims;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		
		System.out.println("jungle dvd tittle: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd tittle: "+ cinderellaDVD.getTitle());
		
		changeTittle(jungleDVD, cinderellaDVD.getTitle());
		System.out.print("jungle dvd tittle: "+jungleDVD.getTitle());
	}

	public static void changeTittle(DigitalVideoDisc dvd, String title) {
		String oldTittle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTittle);
	}

	private static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(dvd1.getTitle(),dvd1.getCategory(),dvd1.getDirector(),dvd1.getLength(),dvd1.getCost());
		dvd1.setAll(dvd2.getTitle(),dvd2.getCategory(),dvd2.getDirector(),dvd2.getLength(),dvd2.getCost());
		dvd2.setAll(dvd3.getTitle(),dvd3.getCategory(),dvd3.getDirector(),dvd3.getLength(),dvd3.getCost());
	}
}

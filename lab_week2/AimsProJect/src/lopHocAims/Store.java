package lopHocAims;

public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
	
	public DigitalVideoDisc[] addDVD( DigitalVideoDisc dvd[]) {
		System.out.println(this.itemsInStore.length);
		for(int i = 0;i<dvd.length;i++) {
			itemsInStore[itemsInStore.length-1] = new DigitalVideoDisc(dvd[i].getTitle(),dvd[i].getCategory(),dvd[i].getDirector(),dvd[i].getLength(),dvd[i].getCost());	
		}
		return itemsInStore;
	}
	
	public DigitalVideoDisc[] removeDVD(DigitalVideoDisc dvd) {
		int check = 0;
		for(int i =0;i<itemsInStore.length;i++) {
			if(this.itemsInStore[i].equals(dvd)) {
				for(int j = i;j<(this.itemsInStore.length-1);j++) {
					this.itemsInStore[j] = this.itemsInStore[j+1];
				}
				this.itemsInStore[itemsInStore.length - 1] = null;
				check =1;
			}
		}
		if(check == 0) System.out.println("DVD not exist");
		return itemsInStore;
	}
	
	public static void main(String args[]) {
		Store test = new Store();
		DigitalVideoDisc [] dvd = new DigitalVideoDisc[3];
		dvd[0] = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers",87,19.95f);
		dvd[1] = new DigitalVideoDisc("Star Wars", "Science Fiction","George Lucas",87,24.95f);
		dvd[2] = new DigitalVideoDisc("Aladin","Animation",18.99f);
		test.itemsInStore = test.addDVD(dvd);
		System.out.print(test.itemsInStore.length);
//		for(int i =0;i<test.itemsInStore.length;i++)
//			System.out.println(test.itemsInStore[i].toString());
	}
	
	
}

package lopHocAims;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered;
	
	public Cart() {
		this.qtyOrdered = 0;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered < MAX_NUMBER_ORDERED)
		{
			this.itemsOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered++;
		}
		else System.out.print("MAX");
	}
	
	public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int check = 0;
		for(int i =0;i<this.qtyOrdered;i++) {
			if(this.itemsOrdered[i].equals(disc)) {
				for(int j = i;j<(this.qtyOrdered-1);j++) {
					this.itemsOrdered[j] = this.itemsOrdered[j+1];
				}
				this.qtyOrdered--;
				check =1;
			}
		}
		if(check==1) return true;
		System.out.print("Không tìm thấy thông tin disc\n");
		return false;
	}
	
	public float totalCost() {
		float answer = 0;
		for(int i=0;i<this.qtyOrdered;i++) {
			answer+=this.itemsOrdered[i].getCost();
		}
		return answer;
	}
}

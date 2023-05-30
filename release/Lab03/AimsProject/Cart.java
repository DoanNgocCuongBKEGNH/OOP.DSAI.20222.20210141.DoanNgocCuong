public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	// Returns the array of items ordered in the cart 
	public DigitalVideoDisc[] getItemsOrdered() {
		return itemsOrdered;
	}
	// Set array of ordered disc in the cart
	public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	// Return the number of DVDs ordered 
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	// Add a single DigitalVideoDisc to the ItemsOrdered array if the quantity ordered is less than MAX_NUMBERS_ORDERED
	// Also prints a message indicating if the cart is almost full
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(getQtyOrdered() < MAX_NUMBERS_ORDERED) {
			// Add disc to ItemsOrdered array at the last index and increment the quantity ordered
			getItemsOrdered()[getQtyOrdered()] = disc;
			setQtyOrdered(getQtyOrdered() + 1);
			// Print a message to indicate the disc has been added and another if the cart is almost full
			System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
			if(getQtyOrdered() == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full.");
			}
		}
	}

	// Add multiple DigitalVideoDiscs to the ItemsOrdered array using the addDigitalVideoDisc() method
	// Also prints a message once all discs have been successfully added
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(DigitalVideoDisc disc : dvdList) {
			// Call the addDigitalVideoDisc() method for each disc in the dvdList array
			addDigitalVideoDisc(disc);
		}
		System.out.println("Tall discs have been successfully added");
	}

	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		DigitalVideoDisc newItemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		int k = 0;
		for(int i = 0; i < getQtyOrdered(); i++) {
			DigitalVideoDisc curDisk = getItemsOrdered()[i];
			if(disc.equals(curDisk)) {
				setQtyOrdered(getQtyOrdered() - 1);
				System.out.println("The disk \"" + disc.getTitle() + "\" has been removed.");
				continue;
			}
			newItemsOrdered[k] = curDisk;
			k += 1;
		}
	}
	
	public float totalCost() {
		float total = 0.0f;
		
		for(int i = 0; i < getQtyOrdered(); i++) {
			total += getItemsOrdered()[i].getCost();
		}
		
		return total;
	}
}


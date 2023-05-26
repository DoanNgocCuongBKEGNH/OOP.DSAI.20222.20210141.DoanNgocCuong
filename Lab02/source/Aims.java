public class Aims {
    
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        
        DigitalVideoDisc[] dvds = {
            new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f),
            new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f),
            new DigitalVideoDisc("Aladin", "Animation", 18.99f)
        };
        
        for (DigitalVideoDisc dvd : dvds) {
            anOrder.addDigitalVideoDisc(dvd);
        }
        System.out.println("Total cost is: " + anOrder.totalCost());

        
        anOrder.removeDigitalVideoDisc(dvds[1]);
        System.out.println("Total cost after removing: " + anOrder.totalCost());
    }

}

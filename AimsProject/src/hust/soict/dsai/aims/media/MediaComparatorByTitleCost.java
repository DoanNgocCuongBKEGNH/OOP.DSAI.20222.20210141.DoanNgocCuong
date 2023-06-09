package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getTitle().compareToIgnoreCase(o2.getTitle()) == 0) {
            if (o1.getCost() > o2.getCost()) {
                return -1;
            } else if (o1.getCost() == o2.getCost()){
                return 0;
            } else {
                return 1;
            }
        }
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}

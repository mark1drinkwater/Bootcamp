package ch6.categorised;

import java.util.ArrayList;
import java.util.List;

public class Z_Defensive {
}

final class Animal5 { // Not an immutable object declaration
    private final ArrayList<String> favoriteFoods;
    public Animal5(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }
    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }
    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }
}
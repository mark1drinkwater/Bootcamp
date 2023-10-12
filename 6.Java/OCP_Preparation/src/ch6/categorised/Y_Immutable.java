package ch6.categorised;

import java.util.ArrayList;
import java.util.List;

public class Y_Immutable {
}

final class Animal3 { // Not an immutable object declaration
    private final ArrayList<String> favoriteFoods;

    public Animal3() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }
}

// Improved version:
final class Animal4 { // An immutable object declaration
    private final List<String> favoriteFoods;

    public Animal4() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }
}
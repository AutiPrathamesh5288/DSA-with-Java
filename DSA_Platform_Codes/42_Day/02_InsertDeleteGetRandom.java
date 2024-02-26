import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Value already exists in the set
        }

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Value doesn't exist in the set
        }

        // Move the last element to the index of the element to be removed
        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);

        // Remove the last element from the list and the map
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}


package seconddemo;

import java.util.ArrayList;

/**
 * @author ζ―θθΏζ
 */
public class Storage {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void setNumber(int num) {
        this.arrayList.add(num);
    }

    public int getNumber(int pos) {
        return this.arrayList.get(pos);
    }

    public int size() {
        return this.arrayList.size();
    }
}

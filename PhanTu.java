import java.io.File;
import java.util.*;

public class PhanTu<T> {
    private <T> test;
    private List<<T>> testarr = new ArrayList<>();

    public <T> getTest {
        return this.test;
    }

    public void setTest(<T> test) {
        this.test = test;
    }

    public boolean isGreaterThan(<T> a) {
        if (this.test > a) 
            return true;
        else
            return false;
    }

    public List<Integer> intsort(File path) {
        List<T> result = new ArrayList<>();
        try {
            Scanner sc = new Scanner(path);
            while (sc.hasNextLine()) {
                result.add(sc.nextLine());
            }
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i) instanceof Integer)
                    continue;
                else
                    result.delete(i);
            }   
        } catch (FileNotFoundException e) 
            return -1;
        return result;       
    }
}

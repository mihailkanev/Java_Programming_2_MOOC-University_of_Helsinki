import java.util.ArrayList;

public class Hideout<T> {
    private T value;

    public void putIntoHideout(T toHide){
        this.value = toHide;
    }

    public T takeFromHideout(){
        if(value == null){
            return null;
        } 
            T temp = value;
            value = null;
            return temp;
    }



    public boolean isInHideout() {
        if(value != null){
            return true;
        } else {
            return false;
        }
    }
}
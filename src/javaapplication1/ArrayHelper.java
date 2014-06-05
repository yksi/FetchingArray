package javaapplication1;

/**
 *
 * @author Vitaliy
 */
public class ArrayHelper {

    public ArrayHelper() {
    }
    
    public ArrayHelper(Object array) {
        object = array;
    }
    
    public boolean valid() {
        return object.getClass().isArray();
    }
    
    public Object[] first_index_arr() {
        Object[] objects = (Object[])object;
        if(valid()) return objects; 
        return null;
    }
    
    Object object;
    
    
}

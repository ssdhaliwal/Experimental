package elsu.database;

/**
 *
 * @author ss.dhaliwal
 * http://javarevisited.blogspot.com/2012/08/how-to-write-parametrized-class-method-Generic-example.html
 */
public class GenericWrapper<T> {
    private T _item;
    
    public T getItem(){
        return this._item;
    }
    
    public void setItem(T item) {
        this._item = item;
    }
}

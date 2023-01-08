public class List<Type> {
    private Type[] value;
    private int firstFreeIndex;

    public List(){
        this.value = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value){
        if(this.firstFreeIndex == this.value.length){
            grow();
        }
        this.value[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public void grow(){
        int newSize = this.value.length + this.value.length/2;
        Type[] newValues = (Type[]) new Object[newSize];

        for(int i = 0; i < this.value.length;i++){
            newValues[i] = this.value[i];
        }
        this.value = newValues;
    }
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }
    
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.value[i].equals(value)) {
                return i;
            }
        }
    
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.value[i] = this.value[i + 1];
        }
    }
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
    
        return this.value[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }
}
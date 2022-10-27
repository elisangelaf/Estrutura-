public class ArrayList implements List {

    int[] data = new int[1000];
    int quantity = 0;
    
    
    public void add(int value) {
        data[quantity] = value;
        quantity++;

    }

    public void remove(int value) {

    }

    public String show(){
        String output = "";
        int i = 0;
        while (i < quantity) {
            output = output + " " + data[i];
            i++;
        }
        return output;

    }

    public void update(int position, int value){

    }
}

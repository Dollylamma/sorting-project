public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        int pmin, temp; 
        for(int i=0; i<input.length; i++){
            pmin=i;
            for(int j=i+1; j<input.length; j++){
            if(input[pmin]>input[j]){
                pmin=j;
            }
            }
            temp= input[pmin];
            input[pmin]=input[i];
            input[i]=temp;
        }
        return input;
    }
}

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        for(int i=1; i<input.length; i++){
            for(int j=i; j>0; j--){
                int temp;
                if(input[j]<input[j-1]){
                    temp=input[j];
                    input[j]=input[j-1];
                    input[j-1]=temp;
                }
            }
        }
    }
}

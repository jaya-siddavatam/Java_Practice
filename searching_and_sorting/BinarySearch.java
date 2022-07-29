package searching_and_sorting;

public class BinarySearch {

    public static  void main(String[] args){


        int[] arr = {3,6,9,12,15};
        int key = 12;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }

public static void binarySearch(int[] arr, int start, int key, int end){

        int midValue = (start+end)/2;
        while(start<=end){

            if(arr[midValue]<key){

                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                end=midValue-1;
            }
            midValue = (start+end)/2;
        }
            if(start>end){

                System.out.println("Element is not found");
            }

}

}

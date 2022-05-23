public class Search {

    int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,23,24};

    int minimum = 0;
    int maximum = array.length - 1;

    public  void binarySearch(int number){
        while (minimum <= maximum){
            int mid = (minimum + maximum) / 2;
            if(number == array[mid]){
                System.out.println("Position of your number: " + mid);
                break;
            } else if (number < array[mid]){
                maximum = mid -1;
            } else if (number > array[mid]){
                minimum = mid + 1;
            }
        }
        if (minimum > maximum){
            System.out.println("The number is not found");
        }
    }
    public void clearSearch(){
        minimum = 0;
        maximum = array.length - 1;
    }
}

/*
STATED BELOW ARE GIVEN THE TIME AND SPACE COMPLEXITY OF THE GIVEN PROGRAM TO REVERSE AN ARRAY.
Time complexity O(n)
Space complexity O(1)
 */

public class reverse_array {
    public static void reverse(int number[]){
        int first=0, last=number.length-1;

        while(first<last){
            // SO SIMPLY WHAT WE DO IN THIS CODE IS EXCHANGE THE ELEMENTS OF ARRAY WITH ONE ANOTHER AND THE ARRAY GETS REVERSED.
            int temp = number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        reverse(number);
        for (int i=0;i< number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}

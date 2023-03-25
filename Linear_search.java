import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int array[] = {10,50,60,14,71,23};

        System.out.println("Enter a key for search: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        for(int i = 0;i< array.length;i++){
            if(array[i] == key){
                System.out.println("Key is found at  "+i+" index");
                break;
            }
            else {
                System.out.println("key is not found in array");
                break;
            }
        }

    }
}
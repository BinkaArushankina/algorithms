package Homework;
public class Homework {
//Homework 04.04.23 Используя принципы отбрасывания констант и оставления только максимально быстро растущего элемента найти
//асимптотики для следующих функций:
//
//f(n) = 9n +73              O(n)
//f(n) = 235                 O(1)
//f(n) = n^2 + 7n +123       O(n^2)
//f(n) = n^3 +2000n +8765    O(n^3)
//f(n) = n + sqrt(n)         O(n)


//Homework 05.04.23
//Самостоятельно повторить написание алгоритма двоичного(binary, interval) поиска и протестировать его
public static void main(String[] args) {
    Homework homework= new Homework();

    int[] numbers= {1,3,5,7,9,11,13,15,17};
    System.out.println(homework.binarySearch(9,numbers));  //4
}
public int binarySearch(int searchNumber, int[] numbers ){  // O(log n)
    int start=0;
    int end=numbers.length-1;
    while (start<=end){
        int middle=(start+end)/2;
        if(searchNumber<numbers[middle]){
            end=middle-1;
        }
        if(searchNumber>numbers[middle]){
            start=middle+1;
        }
        if(searchNumber == numbers[middle]){
            return middle;
        }
    }
    return -1;
}

}

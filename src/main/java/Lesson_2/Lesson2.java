package Lesson_2;

public class Lesson2 {

    public static int[] arrChange(int[] arr1) {
        //Метод получает массив из нулей и единиц.
        // и заменяет нули на единицы, а единицы на нули.
        for(int i=0; i<arr1.length;i++){
            arr1[i] = (arr1[i] == 1) ? 0: 1;
    /*if (arr1[i]==1) {
      arr1[i]=0;
    } else {
      arr1[i]=1;
    }
    */
        }
        return arr1;
    }

    public static int [] lessSixMultTwo(int arrX[]) {
        //Метод просматривает целочисленный массив и числа меньше 6 умножает на 2

        for (int i=0; i<arrX.length - 1; i++)    {
            if (arrX[i] < 6) {
                arrX[i]*=2;
            }

        }
        return arrX;
    }


    public static int arrMax(int[] arr) {

        int maxVal=0;
        int valPromezh;
        for(int i=0, j=arr.length-1; i<arr.length - 1; i++, j--) {

            valPromezh = (arr[i] > arr[j]) ? arr[i]: arr[j];

            if (maxVal < valPromezh) {
                maxVal = valPromezh;
            }

        }
        return maxVal;
    }

    public static int arrMin(int[] arr) {

        int minVal=0;
        int valPromezh = 0;
        for(int i=0, j=arr.length-1; i<arr.length - 1; i++, j--) {

            valPromezh = (arr[i] < arr[j]) ? arr[i]: arr[j];

            if (minVal > valPromezh) {
                minVal = valPromezh;
            }

        }
        return minVal;
    }


    public static int[][] oneInDiagonals(int[][] arrSquare) {
        //Метод получает двумерный квадратный массив, заполняет его диагонали единицами. и возвращает результат в двумерном массиве

        for(int i=0, j=arrSquare.length-1; i<arrSquare.length; i++,j--) {

            arrSquare[i][i] = 1;
            arrSquare[i][j] = 1;

        }
        return arrSquare;
    }




    public static void main(String[] args) {

        //ЗАДАНИЕ 1. Задан массив из нулей и единиц. Заменить нули на единицы, а единицы на нули.
        int[] arrFinal = {1,1,1,0,0,0,1,1,1};
        arrFinal = arrChange(arrFinal);
        for(int i=0; i<arrFinal.length; i++){
            System.out.print(arrFinal[i] + ", ");
        }

        System.out.println();

        //ЗАДАНИЕ 2. Заполнить массив из 8 элементов числами, увеличивающимися на 3.
        System.out.print("[");
        int[] arr8 = new int[8];
        for(int i=0, j=0; i<8; i++,j+=3){
            arr8[i] = j;
            System.out.print(j + ",");
        }
        System.out.println("]");

        //ЗАДАНИЕ 3. Есть целочисленный массив. Надо в нём числа меньше 6 умножить на 2
        int [] givenArr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        givenArr = lessSixMultTwo(givenArr);

        for(int i=0; i<givenArr.length - 1; i++) {
            System.out.print(givenArr[i] + " ");
        }

        System.out.println();

        //ЗАДАНИЕ 5**. Задан целочисленный массив. Найти максимальный и минимальный элементы массива.
        int[] someArr = {-50, 415, 78, 5, 41, 60, 23, };

        System.out.println("Максимальное: " + arrMax(someArr));
        System.out.print("Минимальное: " + arrMin(someArr));

        System.out.println("");

        //ЗАДАНИЕ 4. Задаётся квадратный целочисленный массив. Нужно заполнить его диагонали числами 1.
        int [][] arrX = {{1,2,3,5,8},{2,5,6,9,5},{7,8,0,9,4}, {7,5,2,3,2}, {6,5,4,8,7}};
        arrX = oneInDiagonals(arrX);

        //arrRandSquare();

        for(int i=0; i<arrX.length; i++) {
            for(int j=0; j<arrX.length; j++) {
                System.out.print(arrX[i][j] + " ");
            }
            System.out.println("");
        }

      /*  arrX = oneInDiagonals(arrX);

        for(int i=0; i<arrX.length - 1; i++) {
            for(int j=0; j<arrX.length - 1; j++) {
                System.out.print(arrX[i][j] + " ");
            }
            System.out.println("");
        }
        */





    }
}








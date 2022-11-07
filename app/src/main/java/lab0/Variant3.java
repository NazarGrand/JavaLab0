package lab0;

import static lab0.Variant3.SeasonOfYear.*;

public class Variant3 {
   public enum MonthOfYear {
       January,
       February,
       March,
       April,
       May,
       June,
       July,
       August,
       September,
       October,
       November,
       December
    }

    public enum SeasonOfYear
    {
        Winter,
        Spring,
        Summer,
        Autumn
    }

    //Integer3*. Дано розмір файлу в байтах. Використовуючи операцію поділу націло,
    // знайти кількість повних кілобайтів, які займає даний файл (1 кілобайт = 1024 байти).
     public int integerNumbersTask(int k) {
        return k/1024;
    }

//    /**
//     *
//     * @param number
//     * @return true, if number is possitive
//     */

    //Boolean3. Дано ціле число A. Перевірити істинність висловлювання: «Число A є парним».
    public boolean booleanTask(int number) {
        return number%2 == 0;
    }

   //If3. Дано ціле число. Якщо воно є позитивним, додати до нього 1;
   // якщо негативним, то відняти від нього 2;
   // якщо нульовим, то замінити його на 10. Вивести отримане число.
   public int ifTask(int number) {
       if (number > 0)
           return number + 1;
        if (number < 0)
           return number - 2;

           return 10;
   }

    //Case3. Даний номер місяця - ціле число в діапазоні 1-12 (1 - січень, 2 - лютий і т. д.).
    //Вивести назву відповідної пори року («зима», «весна», «літо», «осінь»).
    public SeasonOfYear switchTask(MonthOfYear month) {
       switch(month)
        {
            case January:
            case February:
            case December:
             return SeasonOfYear.Winter;
            case March:
            case April:
            case May:
             return SeasonOfYear.Spring;
            case June:
            case July:
            case August:
             return SeasonOfYear.Summer;
            case September:
            case October:
            case November:
             return SeasonOfYear.Autumn;
        }
        return Winter;
   }

    //For3. Дано два цілих числа A і B (A < B).
    // Вивести в порядку зменшення всі цілі числа, розташовані між A і B (не включаючи числа A і B),
    // а також кількість N цих чисел.
        public int[] forTask(int a, int b) {
       //throw new IllegalArgumentException();
       //throw new RuntimeException();
        assert a<b: "Argument a should be less than argument b";

        int[] array = new int[b-a];
        int k=0;
        for(int i = b-1; i > a; i--)
           array[k++] = i;

        array[k] = b-a-1;

        return array;
    }

    //While3. Дані цілі додатні числа N і K.
    // Використовуючи тільки операції додавання і віднімання,
    // знайти частку від поділу націло N на K, а також залишок від цього поділу.
        public int[] whileTask(int n, int k) {
        assert (n > 0 && k > 0): "Arguments should be more than zero";

        int c,r;
            c = 0;
            while (n>=k) {
                n = n - k;
                c = c + 1;
            }
            r=n;

        return new int[]{c,r};
    }

    //Array3. Дано ціле число N (> 1), а також перший член A та різницю D арифметичної прогресії.
    // Сформувати та вивести масив розміру N, що містить N перших членів даної прогресії:
   // A, A+D, A+2·D, A+3·D, … .
    public double[] arrayTask(int n, double A, double D) {
       double[] massiv = new double[n];
       for(int i = 0; i < n; i++)
           massiv[i] = A + i*D;

       return massiv;
    }

    //Matrix3. Дано цілі позитивні числа M, N та набір з M чисел.
    // Сформувати матрицю розміру M ґ N, яка в кожному стовпці містить усі числа
    // з вихідного набору (у тому самому порядку).
        public int[][]  twoDimensionArrayTask(int m, int n, int[] array) {
            assert (m > 0 && n > 0): "Arguments should be more than zero";
        int[][] result = new int[m][n];
          for(int i = 0; i < m; i++)
              for(int j = 0; j < n; j++)
                  result[i][j] = array[i];
        return result;
}


    public static void main(String... strings) {
    }
}


public class Arrays {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        //Задача №1. Вывести первые три элемента массива
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }

        //Задача №2. Вывести первую половину массива
        for (int i = 0; i < (nums.length / 2); i++) {
            System.out.println(nums[i]);
        }

        //Задача №3. Вывести вторую половину массива
        for (int i = nums.length / 2; i >= (nums.length / 2) && i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //Задача №4. Вывести все элементы массива, кроме первого и последнего
        for (int i = 1; i < nums.length - 1; i++) {
            System.out.println(nums[i]);
        }

        //Задача №5. Вывести последние три элемента массива
        for (int i = nums.length - 3; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //Задача №6. Вывести чётные элементы массива (по порядку, каждый 2-ой элемент)
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) { //т.к. позиции индексов нечетные (1,3,5,7...)
                System.out.println(nums[i]);
            }
        }

        //Задача №7.Вывести кол-во положительных и отрицательных элементов.
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println("Кол-во положительных элементов " + positiveCount);
        System.out.println("Кол-во отрицательных элементов " + negativeCount);

        //Задача №8. Найти максимальный и минимальный элементы массива
        int maxElement = nums[0];
        int minElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            } else if (nums[i] < minElement) {
                minElement = nums[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + maxElement);
        System.out.println("Минимальный элемент массива: " + minElement);
    }
}
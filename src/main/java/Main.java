import ru.netology.Filter;
import ru.netology.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Здравствуйте! Запускаем программу");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            logger.log("Просим пользователя ввести данные для списка.");
            System.out.println("Введите размер списка: ");
            int sizeList = Integer.parseInt(scanner.nextLine()) - 1;

            System.out.println("Введите верхнюю границу для значений: ");
            int upBorder = Integer.parseInt(scanner.nextLine());

            logger.log("Создаем и наполняем список.");
            List<Integer> randomList = new ArrayList<>();
            for (int i = 0; i <= sizeList; i++) {
                randomList.add(new Random().nextInt(upBorder));
            }
            System.out.println("Вот случайный список: " + randomList.toString()
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .trim());

            logger.log("Просим пользователя ввести данные для фильтрации.");
            System.out.println("Введите порог для фильтра: ");
            int filterMeaning = Integer.parseInt(scanner.nextLine());
            Filter filter = new Filter(filterMeaning);
            System.out.println("Отфильрованный список: " + filter.filterOut(randomList).toString()
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .trim());
            logger.log("Завершаем программу");
            break;
        }
    }
}
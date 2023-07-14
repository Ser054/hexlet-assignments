package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// BEGIN
class App{
    public static Long getCountOfFreeEmails(List<String> emails){
        Long countFree = 0L;
        if(emails != null){
            countFree = emails.stream()
                    .filter(email -> email.contains("@gmail.com") || email.contains("@yandex.ru") || email.contains("@hotmail.com"))
                    .count();
        }
        return countFree;
    }

    public static void main(String[] args) {
        String[] emails = {
                "info@gmail.com",
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "info@hotmail.com",
                "support.yandex.ru@host.com"
        };
        List<String> emailsList = Arrays.asList(emails);
        System.out.println(App.getCountOfFreeEmails(emailsList));
    }

}
// END

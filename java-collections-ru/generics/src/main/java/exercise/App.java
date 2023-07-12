package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App{
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where){
        List<Map<String, String>> findBooks = new ArrayList<>();

        for(int i = 0; i < books.size(); i++){
            for(Map.Entry<String, String> book: books.get(i).entrySet()){
                Boolean allCorrect = false;
                for(Map.Entry<String, String> defineInfo: where.entrySet()){
                    //!!!
                    if(book.getKey() == defineInfo.getKey() && book.getValue() == defineInfo.getValue()){
                        allCorrect = true;
                    }
                    else if (book.getKey() == defineInfo.getKey() && book.getValue() != defineInfo.getValue()){
                        allCorrect = false;
                        break;
                    }
                }
                if(allCorrect){
                    Map<String, String> findBook = new HashMap<>();
                    findBook.putAll(books.get(i));
                    findBooks.add(findBook);
                }
            }
        }

        return findBooks;
    }
    /*public static void main(String[] args) {
        List<Map<String, String>> books = new ArrayList<>();

        Map<String, String> book1 = new HashMap<>(
                Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611")
        );
        Map<String, String> book2 = new HashMap<>(
                Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111")
        );
        Map<String, String> book3 = new HashMap<>(
                Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611")
        );
        Map<String, String> book4 = new HashMap<>(
                Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222")
        );
        Map<String, String> book5 = new HashMap<>(
                Map.of("title", "Still foooing", "author", "FooBar", "year", "3333")
        );
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Map<String, String> where = new HashMap<>(Map.of("author", "Shakespeare", "year", "1611"));

        List<Map<String, String>> result = App.findWhere(books, where);

        System.out.println(result);
    }*/
}
//END

package Lab05.exam2;

public class TestBook {
   public static void main(String[] args) {
       Author codeLean = new Author("Code Lean", "codeleanvn@gmail.com", 'f');
       System.out.println(codeLean);
       Book dummyBook = new Book("Java for dummy", codeLean,19.95,99);
       System.out.println(dummyBook);
        }
    }


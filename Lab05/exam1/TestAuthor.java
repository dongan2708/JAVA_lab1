package Lab05.exam1;

public class TestAuthor {
    public static void main(String[] args) {
        Author codeLean = new Author("Code Lean","codeleanvn@gmail.com",'f');
        System.out.println(codeLean);
        codeLean.setEmail("codelean@gmail.com");
        System.out.println("name is"+ codeLean.getName());
        System.out.println("email is"+ codeLean.getEmail());
        System.out.println("gender is"+ codeLean.getGender());
    }
}
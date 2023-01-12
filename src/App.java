import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        User newUser = new User();

        System.out.println("Digite um nome de usuário: ");
        Scanner name = new Scanner(System.in); 
        newUser.setName(name.nextLine());

        System.out.println("Digite um email: ");
        Scanner email = new Scanner(System.in); 
        newUser.setEmail(email.nextLine());


        System.out.println("Digite uma senha: ");
        Scanner pass = new Scanner(System.in); 
        newUser.setPass(pass.nextLine());


        System.out.println("Digite um nome de universidade: ");
        Scanner university = new Scanner(System.in); 
        newUser.setUniversity(university.nextLine());

        System.out.println("Digite o titulo da questão: ");
        Scanner title = new Scanner(System.in);
        String titleString = title.nextLine();
        System.out.println("Digite o texto da questão: ");
        Scanner text = new Scanner(System.in); 
        String TextString = text.nextLine();

        Question question = new Question(titleString, TextString);

        newUser.setUserQuestion(question);

        System.out.println("\n\n..........................................");

        System.out.println("userId: " + newUser.getId());
        System.out.println("Name: " + newUser.getName());
        System.out.println("Email: " + newUser.getEmail());
        System.out.println("Password: " + newUser.getPass());
        System.out.println("University Name: " + newUser.getUniversity());
        System.out.println("\n..........................................");
        System.out.println("Question ID: " + newUser.getUserQuestions().getId());
        System.out.println("Title: " + newUser.getUserQuestions().getTitle());
        System.out.println("Question Text/statement: " + newUser.getUserQuestions().getStatement());

    }
}

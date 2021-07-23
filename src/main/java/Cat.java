import java.util.Scanner;

public class Cat {

    private String name;
    private int age;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(){
        this.name = "Кот";
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        Cat myCat = new Cat("Sega");
        String name = myCat.getName();

        myCat.consoleNameInput();
        myCat.consoleNameOutput();

        myCat.consoleAgeInput();
        myCat.consoleAgeOutput();
        myCat.consoleStateOutput();

        myCat.checkKnowledge();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void consoleNameOutput(){
        System.out.println(this.name);
    }

    public void consoleNameInput(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        this.name = str;
    }

    public void consoleAgeOutput(){
        System.out.println(this.age);
    }

    public void consoleAgeInput(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        try {
            this.age = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Ожиадалось число, а введена строка " + str);
        }
    }

    public void consoleStateOutput(){
        String state = "";
        if (this.age <= 1){
            state = "Ребенок";
        } else if (this.age < 5){
            state = "Молодой котик";
        } else {
            state = "Старичок";
        }
    }

    public void checkKnowledge(){
        System.out.print("Введите команду: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        boolean isKnow = false;
        switch (str){
            case "сидеть":
                isKnow = true;
                break;
            case "тапки":
                isKnow = true;
                break;
            case "фу":
                isKnow = true;
                break;
        }
        if (isKnow){
            System.out.println("Котик знает такую команду");
        } else {
            System.out.println("Котик не знает такой команды");
        }
    }
}

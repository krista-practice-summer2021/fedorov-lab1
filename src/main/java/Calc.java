import java.util.Scanner;

public class Calc {

    private String[] mas;
    private int ans;
    boolean isSuccess = true;

    public static void main(String[] args) {

        Calc myCalc = new Calc();
        myCalc.consoleExpInput();
        myCalc.calculate(myCalc.mas);
        if (myCalc.isSuccess){
            myCalc.consoleAnsOutput();
        }

    }

    public void consoleExpInput(){
        System.out.println("Введите выражение: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        this.mas = str.split(" ");
    }

    public void calculate(String[] mas){

        switch (mas[1]){
            case "+": this.ans = Integer.parseInt(mas[0])+Integer.parseInt(mas[2]); break;
            case "-": this.ans = Integer.parseInt(mas[0])-Integer.parseInt(mas[2]); break;
            case "*": this.ans = Integer.parseInt(mas[0])*Integer.parseInt(mas[2]); break;
            case "/":
                try {
                    this.ans = Integer.parseInt(mas[0])/Integer.parseInt(mas[2]);
                } catch(ArithmeticException e){
                    System.out.println("Делить на 0 нельзя!");
                    isSuccess = false;
                }
                break;
        }
    }

    public void consoleAnsOutput(){
        System.out.println("Ответ: " + this.ans);
    }
}

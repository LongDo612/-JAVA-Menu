import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1.Draw the triangle");
            System.out.println("2.Square");
            System.out.println("3.Draw the rectangle");
            System.out.println("0.Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                for (int i=0;i<6;i++){
                    for (int j=0;j<6;j++){
                        if (j > i)
                            System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i=0;i<6;i++){
                    for (int j=0;j<6;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i=0;i<3;i++){
                    for (int j=0;j<6;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 0:
                break;
        }
    }
}

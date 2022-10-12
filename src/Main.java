import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        Scanner attack = new Scanner(System.in);
        Scanner ingredient = new Scanner(System.in);
        Scanner ugn = new Scanner(System.in);
        Scanner form = new Scanner(System.in);
        Scanner sprinkle = new Scanner(System.in);
        Scanner f = new Scanner(System.in);
        Friend Goomba = new Friend("Goomba", 50, false);
        Friend Player = new Friend("Player", 100, true);

        System.out.println("Welcome to Bash A Monster!");
        System.out.println("Your monster is Goomba! What do you want to do with it?");
        System.out.println();
        System.out.println("1 - Battle it");
        System.out.println("2 - Have a cooking battle");
        int theChoice = choice.nextInt();

        if (theChoice == 1) {
            System.out.println("Get ready for battle");
            while (Goomba.hp <= 50 && Goomba.hp > 0 && Player.hp > 0 && Player.hp <= 100) {
                System.out.println();
                System.out.println("_____________________");
                System.out.println("Your opponent Goomba has " + Goomba.hp + " hp!");
                System.out.println("You have " + Player.hp + " hp!");
                System.out.println("What attack do you want to do?");
                System.out.println("1 - Kick");
                System.out.println("2 - Punch");
                System.out.println("3 - Verbal assault");
                int attacking = attack.nextInt();
                System.out.println();
                if (attacking == 1) {
                    if (Goomba.hp >= 20) {
                        Goomba.hit(20);
                        System.out.println("You kicked Goomba in the nuts! He took 20 damage!");
                    } else {
                        Player.hit(20);
                        System.out.println("You tried to kick but Goomba grabbed your leg and kicked YOU instead! You took 20 damage!");
                    }
                } else if (attacking == 2) {
                    if (Goomba.hp >= 10) {
                        Goomba.hit(10);
                        System.out.println("You punched Goomba in his face! He took 10 damage!");
                    } else {
                        Player.hit(10);
                        System.out.println("You tried to punch Goomba but he took your arm and punched your face with your own arm! You took 10 damage!");
                    }
                } else if (attacking == 3) {
                    Goomba.hit(5);
                    System.out.println("You cursed Goomba out! He took 5 emotional damage! :(");
                }
                drawWindow();
            }
            if (Goomba.hp <= 0) {
                System.out.println("You killed Goomba");
            } else if (Player.hp <= 0) {
                System.out.println("Goomba killed you");
            }
        } else if (theChoice == 2) {
            System.out.println("Time to cook against Goomba!");
            int Pgood = 0;
            int Ggood = 0;
            System.out.println("The meal you're going to cook is Ratatouille from Ratatouille!");
            System.out.println("---------------");
            System.out.println("First! What ingredient do you need?");
            System.out.println("1 - Salvia");
            System.out.println("2 - Cloves");
            int ingredients = ingredient.nextInt();
            if (ingredients == 1) {
                Pgood += 1;
            }
            Ggood += 1;
            System.out.println("---------------");
            System.out.println("Now, which degree are you setting the oven to?");
            System.out.println("1 - 180");
            System.out.println("2 - 225");
            int ugnn = ugn.nextInt();
            if (ugnn == 2) {
                Pgood += 1;
            }
            System.out.println("---------------");
            System.out.println("Okay, next, how are you going to cut your vegetables?");
            System.out.println("1 - Thinn, big circle formed slices");
            System.out.println("2 - THICK CUBE SLICES");
            int formm = form.nextInt();
            if (formm == 1) {
                Pgood += 1;
            }
            Ggood += 1;
            System.out.println("-------------");
            System.out.println("Ok girl, now, what you gonna sprinkle over the vegetables?");
            System.out.println("1 - olive oil");
            System.out.println("2 - Vinegar");
            int sprinkles = sprinkle.nextInt();
            if (sprinkles == 1) {
                Pgood += 1;
            }
            Ggood += 1;
            System.out.println("---------------");
            System.out.println("Finally, how long are you putting the ratatouille in the oven for?");
            System.out.println("1 - 50 minutes;");
            System.out.println("2 - 30 minutes;");
            int ff = f.nextInt();
            if (ff == 2) {
                Pgood += 1;
            }

            System.out.println("------------");
            System.out.println();
            System.out.println("Now for the final results!");
            System.out.println("The winner is....");
            if (Pgood > Ggood) {
                System.out.println("You! You won the cooking contest!");
            } else if (Ggood > Pgood) {
                System.out.println("Goomba! Goomba won the cooking contest!");
            } else if (Pgood == Ggood) {
                System.out.println("It's a... it's a tie? Are you serious right neow bro?");
            }

            System.out.println();
        }
    }

    public static void drawWindow() {
        JFrame frame = new JFrame("Healthbar"); //create the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        Healthbar healthbar = new Healthbar(); //Create the canvas
        healthbar.setPreferredSize(new Dimension(600, 300));
        frame.getContentPane().add(healthbar); // add the canvas to the frame
        frame.pack(); // Package everything
        frame.setVisible(true); //make everything visible
    }
}
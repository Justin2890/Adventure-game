import java.util.Scanner;

public class Character {
    private String name, nickName, gClass;
    private int age;

    Scanner input = new Scanner(System.in);

    public void setName() {
            System.out.println("Please enter a Username: \n" +
                    "(Do not include numbers)");
            System.out.println("Not a valid username, no numbers.");

        name = input.next();

        System.out.println("Now enter a nickname: ");
        nickName = input.next();

    }

    public void setAge() {
        do {
            System.out.println("Please enter an appropriate (18+) adventurer age: ");
            while (!input.hasNextInt()) {
                System.out.println("What you've entered ain't a number, punk.");
                input.next();
            }
            age = input.nextInt();
        } while (age < 18);
        System.out.println("Age entered: " + age);
        System.out.println("Is the age entered correct?");
        String choice;
        choice = input.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Ok, we'll move on to Class selection!");
        } else {
            System.out.println("Ok let's run this again...");
            setAge();
        }
    }

    public void setClass() {
        int choice;
        String confirm;
        do {
            System.out.println("Please select a class from the options: " +
                    "(1-5)");
            System.out.println("1.Fighter \n" + "2.Mage \n"
                    + "3. Cleric \n" + "4. Tank\n" + "5. Thief\n");
            while (!input.hasNextInt()) {
                System.out.println("Not a number, choose again.");
                input.next();
            }
            choice = input.nextInt();
        }
            while (choice <= 0);

            switch (choice) {
                case 1:
                    System.out.println("You've chosen the Fighter class");
                    //Insert class description method here
                    System.out.println("Are you sure?");
                    confirm = input.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        gClass = "Fighter";
                        break;
                    } else {
                        System.out.println("Alright, lets take it from the top!");
                        setClass();
                    }
                    break;
                case 2:
                    System.out.println("You've chosen the Mage class");
                    //Insert class description method here
                    System.out.println("Are you sure?");
                    confirm = input.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        gClass = "Mage";
                        break;
                    } else {
                        System.out.println("Alright, lets take it from the top!");
                        setClass();
                    }
                    break;
                case 3:
                    System.out.println("You've chosen the Cleric class");
                    //Insert class description method here
                    System.out.println("Are you sure?");
                    confirm = input.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        gClass = "Cleric";
                        break;
                    } else {
                        System.out.println("Alright, lets take it from the top!");
                        setClass();
                    }
                    break;
                case 4:
                    System.out.println("You've chosen the Tank class");
                    //Insert class description method here
                    System.out.println("Are you sure?");
                    confirm = input.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        gClass = "Tank";
                        break;
                    } else {
                        System.out.println("Alright, lets take it from the top!");
                        setClass();
                    }
                    break;
                case 5:
                    System.out.println("You've chosen the Thief class");
                    //Insert class description method here
                    System.out.println("Are you sure?");
                    confirm = input.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        gClass = "Thief";
                        break;
                    } else {
                        System.out.println("Alright, lets take it from the top!");
                        setClass();
                    }
                    break;
                default:
                    System.out.println("Error, selection not within range\n" +
                            "You will be labeled 'unemployed' if you don't choose.\n" +
                            "is this fine?");
                    confirm = input.next();
                    if (confirm.equalsIgnoreCase("yes")) {
                        System.out.println("uh, ok...ya bum.");
                        gClass = "Bum";
                    } else {
                        System.out.println("Alright, lets take it from the top!");
                        setClass();
                    }
                    break;
            }
        }

        public void readInput(){
        setName();
        setAge();
        setClass();
        }

    public void writeOutput(){
        System.out.println(nickName + "'s " +  "Stats are: ");
        System.out.println("Real Name: " + name);
        System.out.println("Player Age: " + age);
        System.out.println("Player Class: " + "'" + gClass + "'");
    }
}
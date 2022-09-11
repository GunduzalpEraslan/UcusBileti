import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        double km, age, tekYon, gidisDonus, kmBasinaUcret = 0.10, howFly,totalPrice, priceWithoutDiscount,ageDiscount=0,roundTripDiscount=0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many km you fly? \nAnswer : ");
        km = input.nextDouble();
        System.out.print("How old are you ?\nAnswer :");
        age = input.nextDouble();
        System.out.println("Choose how you fly.");
        System.out.print("One way ticket:1 \nRound trip : 2\nAnswer : ");
        howFly = input.nextDouble();
        priceWithoutDiscount = km * kmBasinaUcret;
        boolean isPrime = true;

        if (howFly < 3 && howFly > 0 && age>0 && km>0) {
            if(age<12){
                ageDiscount=(priceWithoutDiscount/2);
                System.out.println("\nAge discount : "+ageDiscount);
            }else if (age>=12 || age<=24)
            { ageDiscount=((priceWithoutDiscount*10)/100)        ;
                System.out.println("\nAge discount : "+ ageDiscount);
            } else if (age>65) {ageDiscount= (priceWithoutDiscount*30)/100;
                System.out.println("\nAge discount : "+ ageDiscount);
            }if (howFly==2){(roundTripDiscount)=(((priceWithoutDiscount-ageDiscount)*20)/100);
                System.out.println("Round trip discount : "+ roundTripDiscount);
            }
            System.out.println("Price without dicount : " + priceWithoutDiscount);

            totalPrice=(priceWithoutDiscount-ageDiscount-roundTripDiscount)*2;
            System.out.println("Total price : "+ totalPrice);
        } else {
            System.out.println("You entered faulty input. ");
        }


    }
}
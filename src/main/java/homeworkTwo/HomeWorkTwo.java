package homeworkTwo;

public class HomeWorkTwo {
    public static void main(String[] args) {



        // 1.UZD

        // 1.3.a
        int x = 7;
        System.out.println("1. UZD. Vai x vērtība ir pozitīva?: " + (x > 0));

        // 1.3.b
        System.out.println("Vai x vērtība ir negatīva?: " + (x < 0));

        // 1.3.c
        System.out.println("Vai x vēŗtība ir lielāka par 5 un mazāka vai vienāda ar 10?: " + (x > 5 && x <= 10));

        // 1.3.d
        System.out.println("Vai x vērtība nav mazāka vai vienāda ar 5 un ir mazāka par 10?: " + (!(x <= 5) && x < 10));

        // 1.3.e
        System.out.println("Vai x vēŗtība ir vienāda ar 0, vai ir vienāda ar 10?: " + (x == 0 || x == 10));

        // 1.3.f
        System.out.println("Vai izteiksmes x * x vērtība ir lielāka par 10?: " + ((x * x) > 10) + "\n");






        // 2.UZD

        int menesaNr = 8;
        String menesaNos;

        switch (menesaNr) {
            case 1:
                menesaNos = "Janvāris";
                break;
            case 2:
                menesaNos = "Feabruāris";
                break;
            case 3:
                menesaNos = "Marts";
                break;
            case 4:
                menesaNos = "Aprīlis";
                break;
            case 5:
                menesaNos = "Maijs";
                break;
            case 6:
                menesaNos = "Jūnijs";
                break;
            case 7:
                menesaNos = "Jūlijs";
                break;
            case 8:
                menesaNos = "Augusts";
                break;
            case 9:
                menesaNos = "Septembris";
                break;
            case 10:
                menesaNos = "Oktobris";
                break;
            case 11:
                menesaNos = "Novembris";
                break;
            case 12:
                menesaNos = "Decembris";
                break;
            default:
                menesaNos = "Ievadiet skaitli no 1 līdz 12";
        }
        System.out.println("2. UZD. Mēneša nosaukums ir: " + (menesaNos) + "\n");





        // 3.UZD

        int skaitlisViens = 11;
        int skaitlisDivi = 22;
        int skaitlisTris = 33;
        int lielakaisSkaitlis = 0;

        if (skaitlisViens > skaitlisDivi && skaitlisViens > skaitlisTris) lielakaisSkaitlis = skaitlisViens;
        if (skaitlisDivi > skaitlisViens && skaitlisDivi > skaitlisTris) lielakaisSkaitlis = skaitlisDivi;
        if (skaitlisTris > skaitlisViens && skaitlisTris > skaitlisDivi) lielakaisSkaitlis = skaitlisTris;
        System.out.println("3. UZD. Vislielākais no trim skaitļiem ir: " + lielakaisSkaitlis + "\n");





        //4.UZD

        String krasa = "Dzeltens";
        if (krasa.equals("Dzeltens")) {
            System.out.println("4. UZD. Kad deg dzeltena krāsa, ir jāgaida, kad iedegsies sarkana vai zaļa krāsa." + "\n");
        } else if (krasa.equals("Sarkans")) {
            System.out.println("4. UZD. Kad deg sarkana krāsa, ielu šķērsot nedrīkst." + "\n");
        } else if (krasa.equals("Zaļš")) {
            System.out.println("4. UZD. Kad deg zaļa krāsa, ielu šķērsot drīkst." + "\n");
        } else {
            System.out.println("4. UZD. Gadījumā, ja nedeg ne zaļa, ne dzeltena, ne sarkana gaisma - Jāpārliecinās, vai ceļš ir brīvs, un tikai tad drīkst šķērsot ielu." + "\n");
        }








        //5.UZD

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();




        //6.UZD

        printBusinessCardTwo("Līga", "Lapiņa", "+371 25826585", 1992);
        printBusinessCardTwo("Jānis", "Krūmiņs", "+371 24692580", 1990);




        //7.UZD

        int summa = sum(4, 10);
        System.out.println("7. UZD." + "\n" + "Summa = " + (summa) + "\n");




        //8.UZD

        System.out.println("8. UZD." + "\n" + "Average = " + (average(10, 2, 4)) + "\n");

    }

    //5.UZD
    static void printBusinessCard() {
        String bcName = "Mana vizītkarte";
        String hash = "###############################";
        String name = "Deins";
        String surname = "Kindzulis";
        String telNo = "+371 28610897";
        int year = 1994;
        System.out.println("5. UZD." + "\n" + bcName + "\n" + hash + "\n" + "Vārds: " + name + "\n" + "Uzvārds: " + surname + "\n"
                + "Telefona numurs: " + telNo + "\n" + "Dzimšanas gads: " + year + "\n" + hash + "\n");
    }


    //6.UZD

    static void printBusinessCardTwo(String name, String surname, String telNo, int year) {
        System.out.println("6. UZD." + "\n" + "Vizītkarte" + "\n" + "################" + "\n" + "Vārds: " + name + "\n" + "Uzvārds: " +
                surname + "\n" + "Telefona numurs: " + telNo + "\n" + "Dzimšanas gads: " + year + "\n" + "###############" + "\n");
    }

    //7.UZD

    static int sum(int a, int b) {
        return a + b;
    }
    //8.UZD

    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }


}

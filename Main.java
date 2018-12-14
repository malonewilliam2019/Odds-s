public class Main {



    public static void main(String[] args) {

        Scen1();
        Scen2();
        Scen3();
        Scen4();
        Scen5();

    }


    public static void Scen1() {

        System.out.println("Scenario 1: Expected result 50%");

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        for (int i = 0; i < count; i++) {
            int result = (int) Math.floor(Math.random() * 6 + 1);

            if (result == 1 || result == 3 || result == 5) {
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True"+ numTrue);
        System.out.println("Count of False"+ numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
    }

    public static void Scen2() {

        System.out.println("Scenario 2: Expected result 70%");

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        for (int i = 0; i < count; i++) {
            int result = (int) Math.floor(Math.random() * 10 + 1);

            if (result == 2 || result == 4 || result == 6||result==7||result==8||result==9||result==10) {
                numTrue++;
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True"+ numTrue);
        System.out.println("Count of False"+ numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
    }
    public static void Scen3() {

        System.out.println("Scenario 3: Expected result 25%");

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        for (int i = 0; i < count; i++) {
            int result = (int) Math.floor(Math.random() * 6 + 1);

            if (result == 2 || result == 4 || result == 6) {
                int result2 = (int) Math.floor(Math.random() * 6 + 1);
                if (result2==1||result2==3||result2==5){
                    numTrue++;
                }else {
                    numFalse++;
                }
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True"+ numTrue);
        System.out.println("Count of False"+ numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
    }
    public static void Scen4() {

        System.out.println("Scenario 4: Expected result 3.7%");

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        for (int i = 0; i < count; i++) {
            int result = (int) Math.floor(Math.random() * 6 + 1);

            if (result == 1 || result == 2) {
                int result2 = (int) Math.floor(Math.random() * 6 + 1);
                if (result2==3||result2==4){
                    int result3 = (int) Math.floor(Math.random() * 6 + 1);
                    if (result3==5||result3==6){
                        numTrue++;
                    }else {
                        numFalse++;
                    }
                }else {
                    numFalse++;
                }
            } else {
                numFalse++;
            }
        }

        System.out.println("Count of True"+ numTrue);
        System.out.println("Count of False"+ numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
    }
    public static void Scen5() {

        System.out.println("Scenario 5: Expected result 27.8%");

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        for (int i = 0; i < count; i++) {
            int result = (int) Math.floor(Math.random() * 6 + 1);

            int result2 = (int) Math.floor(Math.random() * 6 + 1);
            if (!(result==result2)){
                int result3=(int) Math.floor(Math.random() * 6 + 1);
                if (!(result==result3||result2==result3)){
                    int result4=(int) Math.floor(Math.random() * 6 + 1);
                    if (!(result==result4||result2==result4||result3==result4)){
                        numTrue++;
                    }
                }else{
                    numFalse++;
                }
            }else{
                numFalse++;
            }
        }

        System.out.println("Count of True"+ numTrue);
        System.out.println("Count of False"+ numFalse);
        System.out.println("Condition reached " + ((float)numTrue/(float)count)*100 + "%");
    }
}

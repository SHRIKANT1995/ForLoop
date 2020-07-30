public class MainJ {
    Test[] intarray = new Test[10];

    public static void main(String[] args) {
        MainJ main = new MainJ();

        for (int i = 0; i < main; i++) {
            main.intarray[i] = new Test(i);
        }
        System.out.println();

        for (Test t : main.intarray) {
            System.out.println(t.a + "");
        }
        System.out.println();

        int counter = 0;
        while (counter < main.intarray.length) {
            System.out.println(main.intarray[counter++].a + ",");
        }
        System.out.println();

        do {
            System.out.println(main.intarray[counter].a +",");
        }
        while (counter<main.intarray.length);


    }
}

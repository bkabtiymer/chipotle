package com.company;



public class Main {

    public static void main(String[] args) {

      ArrayList<String> food=new ArrayList<>();
      System.out.println("here are the 10 combos of chipotle: ");
      for (int i=0;i<10;i++)
      foodList(food);





//// then for each of the arrays do something (pick a random element from it)
//        Random random = new Random();
//        for(Array[] currentArray : arrayList){
//            String chosenString = currentArray[random.nextInt(currentArray.lenght)];
//            System.out.println(chosenString);
//        }
    }

    private static void foodList(ArrayList<String> food) {

        String rice[] = {"white", "brown", "no rice"};
        String meat[] = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String beans[] = {"pinto", "black", "no beans"};
        String salsa[] = {"mild", "medium", "hot", "no salsa"};
        String veggies[] = {"lettuce", "fajita veggies", "no veggies"};

        List <String>rice2= new ArrayList<String>();
        Collections.addAll(rice2,rice);
        List <String>meat2= new ArrayList<String>();
        Collections.addAll(meat2,meat);
        List <String>beans2= new ArrayList<String>();
        Collections.addAll(beans2,beans);
        List <String>salsa2= new ArrayList<String>();
        Collections.addAll(salsa2,salsa);
        List <String>veggies2= new ArrayList<String>();
        Collections.addAll(veggies2,veggies);

        long seed = System.nanoTime();
        Collections.shuffle(rice2,new Random(seed));
        Collections.shuffle(meat2, new Random(seed));
        Collections.shuffle(beans2,new Random(seed));
        Collections.shuffle(salsa2,new Random(seed));
        Collections.shuffle(veggies2, new Random(seed));


        System.out.println("The first random burrito is: "+rice2);
        System.out.println("The second random burrito is: "+meat2);
        System.out.println("The third random burrito is: "+beans2);
        System.out.println("The fourth random burrio is:"+salsa2);
        System.out.println("The fifth random burrito is: "+veggies2);

//
//
//
//
//        List meat2=Arrays.asList(meat);
//
//
////        ArrayList<String>food = new ArrayList<String>();
////


    }
}
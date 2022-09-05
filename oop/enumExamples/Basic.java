package com.manikanta.oop.enumExamples;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum Constants
        // public, static , final
        // since its final you cann't create child enums
        //type is Week


        Week() {
            System.out.println("Constructor called for "+ this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        // this is not public or protected , only private or default
        // why? we don't want to create new object
        // this is not the enum concept, that's why

        // internally: it is like
        // public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
        System.out.println(Week.valueOf("Monday"));
//        for (Week day : Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
        week.hello();
    }
}

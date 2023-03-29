package EnumExample;

public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // these are enum constants
        // By default they are public, static and final
        // since its final you can create child enums
        // type is Week
        // enums can't extend classes because it internally extends enum class but can
        // implement interface
        void Week() {
            System.out.println("Constructor called for " + this);
        }

        // Abstract methods are not allowed

        // this is not public or protected, only private or default
        // why? because we don't want to create new objects
        // this is not enums concept, that's why

        @Override
        public void hello() {
            System.out.println("Hey! How are you?");
        }

        // internally--> public static final Week Monday = new Week();

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
        for (Week day : Week.values())
            System.out.print(day + " ");
        System.out.println();
        System.out.println(week);
        System.out.println(week.ordinal()); // ordinal for index

    }
}

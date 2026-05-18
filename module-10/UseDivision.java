public class UseDivision {
    public static void main(String[] args) {

        // Create InternationalDivision objects
        InternationalDivision intDiv1 =
                new InternationalDivision("Global Tech", 1001,
                        "Japan", "Japanese");

        InternationalDivision intDiv2 =
                new InternationalDivision("Euro Sales", 1002,
                        "Germany", "German");

        // Create DomesticDivision objects
        DomesticDivision domDiv1 =
                new DomesticDivision("West Coast Operations", 2001,
                        "California");

        DomesticDivision domDiv2 =
                new DomesticDivision("East Coast Support", 2002,
                        "New York");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
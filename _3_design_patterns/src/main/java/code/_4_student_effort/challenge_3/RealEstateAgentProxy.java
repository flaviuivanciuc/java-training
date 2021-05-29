package code._4_student_effort.challenge_3;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    public void represent(Apartment apartment) {
        apartments = Arrays.copyOf(apartments, apartments.length + 1);
        apartments[apartments.length - 1] = apartment;
    }

    public Apartment rent(Student student) {
        Apartment rentedApartment = null;
        if (!student.getName().startsWith("P")) {
            for (int i = 0; i < apartments.length; i++) {
                if (apartments[i].getMonthlyRentCost() < student.getMoney())
                    rentedApartment = apartments[i];

                int removedIndex = i;
                System.arraycopy(apartments, removedIndex + 1, apartments, removedIndex, apartments.length - 1 - removedIndex);
            }
        }
        return rentedApartment;
    }
}

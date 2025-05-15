package homework_6_1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Patsiyent patsiyent = new Patsiyent();
        patsiyent.setPlan(1);
        Terapevt terapevt = new Terapevt();
        terapevt.infodoctor(patsiyent.getPlan());
        patsiyent.setDoctor(terapevt.getDoctor());
        if (Objects.equals(terapevt.getDoctor(), "Хирург")) {
            Khirurg khirurg = new Khirurg();
            khirurg.lechit();
        } else if (Objects.equals(terapevt.getDoctor(), "Дантист")) {
            Dentist dentist = new Dentist();
            dentist.lechit();
        } else if (Objects.equals(terapevt.getDoctor(), "Терапевт")) {
            terapevt.lechit();
        }
    }
}

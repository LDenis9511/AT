package homework_6_1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        patsiyent patsiyent = new patsiyent();
        patsiyent.setPlan(1);
        terapevt terapevt = new terapevt();
        terapevt.infodoctor(patsiyent.getPlan());
        patsiyent.setDoctor(terapevt.getDoctor());
        if (Objects.equals(terapevt.getDoctor(), "Хирург")) {
            khirurg khirurg = new khirurg();
            khirurg.Lechit();
        } else if (Objects.equals(terapevt.getDoctor(), "Дантист")) {
            dentist dentist = new dentist();
            dentist.Lechit();
        } else if (Objects.equals(terapevt.getDoctor(), "Терапевт")) {
            terapevt.Lechit();
        }
    }
}

package homework_6_1;

public class terapevt extends doctor {
    private String doctor;

    public String infodoctor(int plan) {
        if (plan == 1) doctor = "Хирург";
        else if (plan == 2) {
            doctor = "Дантист";
        } else doctor = "Терапевт";
        System.out.println("Назначен врач : " + doctor);
        return doctor;
    }

    public String getDoctor() {
        return doctor;
    }

    @Override
    void Lechit() {
        System.out.println("Терапевт лечит...");
    }

}

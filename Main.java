import creatures.Crowd;
import creatures.Troll;
import exceptions.WrongAngleException;
import objects.*;
import surroundings.Environment;
import surroundings.TimeOfDay;
import surroundings.Weather;

public class Main {
    public static void main(String[] args) {

    // initialization
        Troll mumitroll = new Troll("Муми-тролль");
        Troll snusmumrik = new Troll("Снусмумрик");
        Troll hemul = new Troll("Хемуль");
        Troll emma = new Troll("Эмма");
        Troll snork = new Troll("Фрекен Снорк");
        Troll filifyonka = new Troll("Филифьонка");
        Troll hemuliha = new Troll("Маленькая Хемулиха");

        Crowd crowd = new Crowd("Зрители");
        Crowd kids = new Crowd("24 лесных малыша");
        Environment env = new Environment();
        Cups cupsOfCoffee = new Cups("Чашки кофе", Size.LITTLE, "Кофе");
        Ramp ramp = new Ramp("Рампа", Size.BIG);
        ramp.setSize(Size.BIG);
        PhysicalObject.Boat snusmumrik_boat = new PhysicalObject.Boat("Лодка", Size.LITTLE);
        PhysicalObject.Boat hemul_boat = new PhysicalObject.Boat("Лодка", Size.LITTLE);
        Hat hat = new Hat("Шляпа", Size.MIDDLE, "Черная", "Старая");
        hat.setName("Шляпа");
        hat.setCondition("Старая");
        SmokingPipe pipe = new SmokingPipe("Трубка", Size.LITTLE);
        Scene scene = new Scene("Вращающаяся сцена", Size.BIG);
        Theatre theatre = new Theatre("Театр", Size.BIG);


    // actions
        crowd.put(cupsOfCoffee);
        crowd.sit(ramp);
        crowd.applaud();

        hemul.look(snusmumrik);
        hemul.move(10, snusmumrik);

        try{
            scene.rotate(400);
        }
        catch (WrongAngleException e){
            System.out.println(e.getMessage());
        }
        scene.rotate();

        emma.laugh();
        crowd.hear(emma);
        crowd.fall();

        kids.pounce(hemul);

        snusmumrik.jump(ramp);
        snusmumrik.sit(snusmumrik_boat);
        mumitroll.fall();

        snork.swim(theatre);
        filifyonka.swim(theatre);
        hemuliha.swim(theatre);

        mumitroll.swim(snusmumrik_boat);
        mumitroll.sit(snusmumrik_boat);
        snusmumrik.row(snusmumrik_boat);

        hemul.sit(hemul_boat);
        hemul.row(hemul_boat);

        env.setWhether(Weather.CALM);
        env.setTime(TimeOfDay.NIGHT);

        snusmumrik.row(snusmumrik_boat);
        mumitroll.look(hat);
        mumitroll.use(pipe);
        mumitroll.look(pipe.rings);
        mumitroll.think("Теперь все будет хорошо");

        snusmumrik.getOut(snusmumrik_boat);
        snusmumrik.laugh();
        mumitroll.sit(snusmumrik_boat);
        mumitroll.use(pipe);

    }
}

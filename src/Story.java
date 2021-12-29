import environment.*;
import heroes.*;

public class Story {
    public static void main(String[] args){
        Shorty nezn = new Shorty("Незнайка");
        Shorty ponch = new Shorty("Пончик");
        Shorty shorties = new Shorty(1488);
        Rat rat1 = new Rat();
        Rat rat2 = new Rat();
        Rat rats = new Rat(228);
        Berth neznBerth = new Berth();
        Food food = new Food(123);
        Bedbugs bedbugs = new Bedbugs(321);

        Hotel hotel = new Hotel();
        hotel.add(neznBerth);
        hotel.add(nezn);
        hotel.add(shorties);
        hotel.add(rat1);
        hotel.add(rat2);
        hotel.add(rats);
        hotel.add(bedbugs);

        Rocket rocketPonch = new Rocket("Ракета Пончика");
        rocketPonch.add(ponch);
        rocketPonch.add(food);



        rat1.runAway();
        rat1.lookAt(nezn);
        nezn.lookAround();
        nezn.noticeThat();
        rat2.gotOutFrom(hotel.notAliveContent.get(1));
        rat2.noseMove();
        nezn.climb(hotel.notAliveContent.get(2));
        nezn.layQuiet();
        shorties.sleep();
        shorties.hadCold();
        shorties.nightmare();
        nezn.rememberedAbout(ponch);
        nezn.rocket.foodCountIn(rocketPonch);
    }
}

package com.xworkz.late.runner;

import com.xworkz.late.external.follow.*;
import com.xworkz.late.internal.ac.*;
import com.xworkz.late.internal.alien.*;
import com.xworkz.late.internal.art.*;
import com.xworkz.late.internal.bag.*;
import com.xworkz.late.internal.bike.*;
import com.xworkz.late.internal.body.*;
import com.xworkz.late.internal.book.*;
import com.xworkz.late.internal.consitution.*;
import com.xworkz.late.internal.hospital.Hospital;
import com.xworkz.late.internal.ipl.*;
import com.xworkz.late.internal.laptop.*;
import com.xworkz.late.internal.people.*;
import com.xworkz.late.internal.plane.*;
import com.xworkz.late.internal.battery.*;
import com.xworkz.late.internal.barbie.*;
import com.xworkz.late.internal.bet.*;
import com.xworkz.late.internal.bjp.*;
import com.xworkz.late.internal.black.*;
import com.xworkz.late.internal.bluetooth.*;
import com.xworkz.late.internal.bottle.*;
import com.xworkz.late.internal.bottom.*;
import com.xworkz.late.internal.cat.*;
import com.xworkz.late.internal.camera.*;
import com.xworkz.late.internal.canon.*;
import com.xworkz.late.internal.carrot.*;
import com.xworkz.late.internal.car.*;
import com.xworkz.late.internal.duck.*;
import com.xworkz.late.internal.college.*;
import com.xworkz.late.internal.connect.*;
import com.xworkz.late.internal.dead.*;
import com.xworkz.late.internal.doctor.*;
import com.xworkz.late.internal.door.*;
import com.xworkz.late.internal.modhi.*;
import com.xworkz.late.internal.medical.*;
import com.xworkz.late.internal.leaf.*;
import com.xworkz.late.internal.moon.*;
import com.xworkz.late.internal.earth.*;
import com.xworkz.late.internal.pluto.*;
import com.xworkz.late.internal.japan.*;
import com.xworkz.late.internal.india.*;
import com.xworkz.late.internal.hospital.*;
import com.xworkz.late.internal.hm.*;
import com.xworkz.late.internal.gold.*;
import com.xworkz.late.internal.game.*;
import com.xworkz.late.internal.friend.*;
import com.xworkz.late.internal.fool.*;
import com.xworkz.late.internal.food.*;
import com.xworkz.late.internal.flower.*;
import com.xworkz.late.internal.fan.*;
import com.xworkz.late.internal.sunflower.*;
import com.xworkz.late.internal.teacher.*;


public class MainRunner {
    public static void main(String[] args) {
        Icc icc=new IndianCricketTeamIccImpl();
        BCC bcc=new BCC(icc);
        bcc.play();

        Consitution consitution=new CitizenConstituionImpl();
        Government government=new Government(consitution);
        government.money();

        Laptop laptop=new LaptopImpli();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.windows();

        AcRemote acRemote=new VoltasAcRemoteImpl();
        AirConditioner airConditioner=new AirConditioner(acRemote);
        airConditioner.turnOn();

        Spaceship spaceship=new MartianShipImpl();
        Alien alien=new Alien(spaceship);
        alien.invade();

        Artist artist=new PainterArtistImpl();
        Art art=new Art(artist);
        art.express();

        Zipper zipper=new BagZipperImpl();
        Bag bag=new Bag(zipper);
        bag.unzip();

        Muscle muscle=new BicepMuscleImpl();
        Arm arm=new Arm(muscle);
        arm.lift();

        Pages pages=new HardcoverPagesImpl();
        Book book=new Book(pages);
        book.read();

        Person person=new ArunPersonImpl();
        Arun arun=new Arun(person);
        arun.doSomething();

        Jet jet=new AirIndiaJetImpl();
        Airoplain airoplain=new Airoplain(jet);
        airoplain.liftOff();

        Bike bike = new KTMbikeImpl();
        TwoWheeler wheeler = new TwoWheeler(bike);
        wheeler.start();

        Battery battery = new BatteryCellImpl();
        Charger charger = new Charger(battery);
        charger.plug();

        Barbie barbie = new BarbieImpl();
        DollHouse dollHouse = new DollHouse(barbie);
        dollHouse.play();

        Bet bet = new BetImpl();
        Casino casino = new Casino(bet);
        casino.gamble();

        BJP bjp = new BJPGovtImpl();
        Election election = new Election(bjp);
        election.vote();

        Black black = new BlackColorImpl();
        Paint paint = new Paint(black);
        paint.apply();

        Bluetooth bluetooth = new BluetoothImpl();
        Speaker speaker = new Speaker(bluetooth);
        speaker.playMusic();

        Bottle bottle = new WaterBottleImpl();
        LunchBag lunchBag = new LunchBag(bottle);
        lunchBag.carry();

        Bottom bottom = new JeansImpl();
        Wardrobe wardrobe = new Wardrobe(bottom);
        wardrobe.organize();

        Cat cat = new PetCatImpl();
        Home home = new Home(cat);
        home.cuddle();

        Camera camera = new DslrCameraImpl();
        Studio studio = new Studio(camera);
        studio.shoot();

        Canon canon = new CanonPrinterImpl();
        Office office = new Office(canon);
        office.manageDocs();

        Carrot carrot = new RedCarrotImpl();
        Market market = new Market(carrot);
        market.sell();

        Car car = new ElectricCarImpl();
        Garage garage = new Garage(car);
        garage.repair();

        Duck duck = new WhiteDuckImpl();
        Lake lake = new Lake(duck);
        lake.swim();

        College college = new EngineeringCollegeImpl();
        Campus campus = new Campus(college);
        campus.enter();

        Connect connect = new WifiConnectImpl();
        Network network = new Network(connect);
        network.signal();

        Dead dead = new GhostImpl();
        HauntedHouse hauntedHouse = new HauntedHouse(dead);
        hauntedHouse.appear();

        Doctor doctor = new SurgeonImpl();
        com.xworkz.late.external.follow.Hospital hospital=new com.xworkz.late.external.follow.Hospital(doctor);
        doctor.treat();

        Door door = new WoodenDoorImpl();
        Room room = new Room(door);
        room.enter();

        Modhi modhi = new PrimeMinisterImpl();
        Nation nation = new Nation(modhi);
        nation.develop();

        Medical medical = new FirstAidImpl();
        Clinic clinic = new Clinic(medical);
        clinic.treat();

        Leaf leaf = new GreenLeafImpl();
        Tree tree = new Tree(leaf);
        tree.grow();

        Moon moon = new SatelliteImpl();
        Sky sky = new Sky(moon);
        sky.shine();

        Earth earth = new BluePlanetImpl();
        Universe universe = new Universe(earth);
        universe.observe();

        Pluto pluto = new DwarfPlanetImpl();
        SolarSystem system = new SolarSystem(pluto);
        system.revolve();

        Japan japan = new TechnologyJapanImpl();
        Asia asia = new Asia(japan);
        asia.showTech();

        India india = new DevelopingIndiaImpl();
        Country country = new Country(india);
        country.progress();

        Hospital hospital1=new CityHospitalImpl();
        HealthCare healthCare=new HealthCare(hospital1);
        healthCare.cure();

        HM hm=new HMShirtImpl();
        Showroom showroom=new Showroom(hm);
        showroom.tryDress();

        Gold gold=new GoldRingImpl();
        Jewellery jewellery=new Jewellery(gold);
        jewellery.display();

        Game game=new CricketGameImpl();
        PlayGround playGround=new PlayGround(game);
        playGround.enjoy();

        Friend friend=new BestFriendImpl();
        Life life=new Life(friend);
        life.support();

        Fool fool=new ClownImpl();
        Circus circus=new Circus(fool);
        circus.perform();

        Food food=new PizzaImpl();
        Restaurant restaurant=new Restaurant(food);
        restaurant.serve();

        Flower flower=new RoseImpl();
        Garden garden=new Garden(flower);
        garden.fragrance();

        Fan fan=new CeilingFanImpl();
        RoomFan roomFan=new RoomFan(fan);
        roomFan.start();

        Sunflower sunflower = new BrightSunflowerImpl();
        Field field = new Field(sunflower);
        field.bloom();

        Teacher teacher = new MathTeacherImpl();
        School school = new School(teacher);
        school.startClass();

    }
}

public class Truck extends Transport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void ServiceSt() {
        if (this.getClass().equals(getClass()))
            System.out.println(" Обслуживаем " + getModelName());
        Serviсe.updateTyre();
        Serviсe.checkEngine();
        Serviсe.checkTrailer();
        System.out.println(getModelName() + " " + getWheelsCount());

    }

}

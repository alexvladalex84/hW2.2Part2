public class Car extends Transport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void ServiceSt() {
        if (this.getClass().equals(getClass()))
            System.out.println(" Обслуживаем " + getModelName());
        Serviсe.updateTyre();
        Serviсe.checkEngine();
        System.out.println(getModelName() + " " + getWheelsCount());

    }


}

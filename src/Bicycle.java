public class  Bicycle extends Transport  {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }




    @Override
    public void ServiceSt() {
        if (this.getClass().equals(getClass()))
            System.out.println(" Обслуживаем " + getModelName());
        System.out.println(getModelName() + " " + getWheelsCount());
        Service service = new Service();
        service.updateTyre();

    }


}

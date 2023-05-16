public class  Bicycle extends Transport implements Serviсe {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }




    @Override
    public void ServiceSt() {
        if (this.getClass().equals(getClass()))
            System.out.println(" Обслуживаем " + getModelName());
        Serviсe.updateTyre();
        System.out.println(getModelName() + " " + getWheelsCount());

    }


}

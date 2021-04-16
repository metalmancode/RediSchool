abstract class Animals {

       private  String animalName= new String();
        private int age;

    public String getAnimalName() {
        return animalName;
    }

    public final void setAnimalName(String animalName) {
        this.animalName = animalName;
        System.out.println("Animal name is " + animalName);
    }

     public abstract void animalMainFood();
}

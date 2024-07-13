package may.ex_16052024.singleheritance;

public class Java extends programming {
    //Single Inharintance - is A
    // Java is programming lang.
    //Python is a programming lang.

    String newFeature;
    // int version; //Instance varible
    //    String author;
    public Java(){
        System.out.println("DC");

    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }
    void printInfo(){
        System.out.println("Feature is -> " + newFeature);

    }

    @Override
    public String toString() {
        return super.toString();
    }

//line no 3 madhe Extends progrmming add kelya mule je progrmming lab amdhe ahe
    // te ikde pn disel bcoz te parent classs ahe
}


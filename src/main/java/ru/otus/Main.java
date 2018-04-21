package ru.otus;

/**
 * Created by Konstantin on 21.04.2018.
 */
public class Main {

    private String first_name;
    private String last_name;
    private String middle_name;

    public Main(String[] fname) {
        if (fname.length>2)
        {
            this.last_name = fname[0];
            this.first_name = fname[1];
            this.middle_name = fname[2];
        }
        else
        {
            this.last_name = "Анонимов";
            this.first_name = "Аноним";
            this.middle_name = "Анонимович";
        }
    }

    public static void main(String[] args) {
    String[] fname = {"Грудцов","Александр","Васильевич"};
    System.out.println(new Main(fname));
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .omitNullValues()
                .add("LastName",this.last_name)
                .add("FirstName",this.first_name)
                .add("MiddleName",this.middle_name)
                .toString();
    }
}

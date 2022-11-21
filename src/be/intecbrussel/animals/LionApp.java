package be.intecbrussel.animals;

import java.util.Arrays;
import java.util.Comparator;

public class LionApp {
    public static void main(String[] args) {
        Lion l1=new Lion("Jean-Roar",20,10);
        Lion l2=new Lion("Jean-Bite",12.5,99);
        Lion l3=new Lion("Jean-Jean",1,2);
        Lion l4=new Lion("Jean-Jeanine",0,25);
        Lion l5=new Lion("Jean-Pas",25,9);
        Lion [] lions=new Lion[]{l1,l2,l3,l4,l5};
        Comparator<Lion>lionNameComparator=
                (lion1,lion2)->lion1.getName().compareTo(lion2.getName());
        Comparator<Lion>lionAgeComparator=
                Comparator.comparing(lion->lion.getAge());

        Arrays.sort(lions,lionAgeComparator.thenComparing(lionNameComparator));
      // Arrays.sort(lions,Comparator.<Lion>naturalOrder().thenComparing(lionNameComparator));
        for (Lion lion:lions){
            System.out.println(lion);
        }
    }
}

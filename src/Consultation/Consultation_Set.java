package Consultation;
import java.util.*;
public class Consultation_Set {
    //1)Est list imen, w kotorom nekotorie imena powtorjautsa. S pomoschju seta napisatj metod, kotorij wernet list bes
    //powtorjajuschichsa elementow
    public static void main(String[] args) {
        Consultation_Set c= new Consultation_Set();
    //1)
        List<String> names= Arrays.asList("Jack","Jack","Jack","John","Anna");
        System.out.println(c.withoutDuplicates(names));

    //2)a teper wernut tolko duplicati
        System.out.println(c.duplicates(names));
    }

    public List<String> withoutDuplicates(List<String> names){

        Set<String> set = new HashSet<>(names);             //kladem names w set, on otrasiwaet wse duplicati

        return  new ArrayList<>(set);                       //kladem set obratno w nowij List i woswrashaem list bes duplicatow
    }

    public List<String> duplicates(List<String> names){
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>(set);
        for(String s:names) {
            if (!set.add(s) && !duplicates.contains(s)) {//poloschit w set.add(s) budet false, tolko w tom slutschae
                                                         // esli eta duplicat. stawja ! mi polutschaem !false, toestj
                                                         // true, i takim obrasom eto uslowie wipolnitsa tolko w
                                                         // slutschae s duplicatom, a ego mi kak ras i ischem.

                duplicates.add(s);                       //najdennij duplicat wstawlaem w duplicates
            }
        }
        return duplicates;                               //no esli budet imja w massiwe powtorjatsa naprimer 3 rasa, ne 2
                                                         // to on wernet eto ima dwa rasa, a nam nuschno schtobi prosto
                                                         // skasal odin ras kto duplicat. poetomu w stroke 28
                                                         // !duplicates.contains(s)(schtobi w List sapisiwalsa duplikat 1ras
    }














}
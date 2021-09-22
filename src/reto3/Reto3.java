package reto3;

import java.util.ArrayList;

public class Reto3 {
    public static ArrayList<String> categorias(ArrayList<String> pacientes){
        ArrayList<String> sinRep = new ArrayList<>();
        String pivot = pacientes.get(0);
        int longitud = pacientes.size();
        sinRep.add(pivot);
        for(int i=1;i<longitud;i++){
            if(!pivot.equals(pacientes.get(i))){
                if(!sinRep.contains(pacientes.get(i))){
                    sinRep.add(pacientes.get(i));
                    pivot=pacientes.get(i);
                }
            }  
        }
        return sinRep;
    }
    public static ArrayList<Integer> mefaltandelacategoria(ArrayList<Integer> numPac,ArrayList<String> pacientes,String caracter){
        int longInt = numPac.size();
        ArrayList<Integer> hacenFalta = new ArrayList<>();
        for(int i=0;i<longInt;i++){
            int posicion = numPac.get(i);
            if(pacientes.get(posicion).equals(caracter)){
                hacenFalta.add(numPac.get(i));
            }
        }
        return hacenFalta;
    }
    public static ArrayList<String> notengopacientes(ArrayList<String> cenSec,ArrayList<String> cenPrim){
        int longSec = cenSec.size();
        int longPrim = cenPrim.size();
        for (int i=0; i<longPrim; i++) {
            for (int j=0; j<longSec; j++) {
                if(cenPrim.get(i).equals(cenSec.get(j))){
                    int indice = cenSec.indexOf(cenSec.get(j));
                    longSec--;
                    cenSec.remove(indice);
                }
        }      
    }
        return cenSec;
    }
    public static Integer puedecambiar(ArrayList<String> cenSec,ArrayList<String> cenPrim){
        ArrayList<String> interes1 = new ArrayList<>();
        ArrayList<String> interes2 = new ArrayList<>(); 
        for (String i:cenSec) {
                if(!cenPrim.contains(i)){
                    interes1.add(i);
            }
        }
        for (String i:cenPrim) {
                if(!cenSec.contains(i)){
                    interes2.add(i);
            }
        }
        int long1 = interes1.size();
        int long2 = interes2.size();
        int result = 0;
        if(long1>long2){
            result=long2;
        }else if(long1<long2){
            result=long1;
        }else if(long1==long2){
            result=long1;
        }
        return result;
    }
    public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();
    lista.add("10");
    lista.add("6");
    lista.add("9");
    lista.add("3");
    lista.add("4");
    lista.add("8");
    lista2.add("11");
    lista2.add("6");
    lista2.add("8");
    lista2.add("12");
    lista2.add("13");
    lista2.add("9");
    lista2.add("5");
    System.out.println(puedecambiar(lista, lista2));
    }
}

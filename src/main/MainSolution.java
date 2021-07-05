package main;

import java.util.Arrays;

public class MainSolution {

    public static void main(String args[]) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        boolean result = cpf.canPlaceFlowers(new int[] {1,0,0,0,1,0,0,}, 2);
        System.out.println(result);

    }
}

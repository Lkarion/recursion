package com.company;

public class Main {

    public static void main(String[] args) {
	// У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов.
        // У нечётных кроликов по два уха. А у чётных кроликов вроде как по три уха. Это из-за того,
        // что они все подняли ногу. Посчитайте количество видимых нами “ушей”.
        // Не использовать циклы или умножение.
        //
        //bunnyEars2(0) → 0
        //bunnyEars2(1) → 2
        //bunnyEars2(2) → 5
        System.out.println(bunnyEars(4) + "ears");

    }

    private static int bunnyEars(int bunnyQuantity) {
        if (bunnyQuantity <= 0) return 0;
        int ears=0;
        if (bunnyQuantity % 2 == 0) {
            ears+=3;
        }else{
            ears+=2;
        }
        ears+=bunnyEars(bunnyQuantity-1);
        return ears;
    }

}

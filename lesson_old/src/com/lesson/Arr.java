package com.lesson;


public class Arr {

    public static void array (int[]in) {
         for (int i = 0; i < in.length; i++) {
             if (i % 2 == 0)  {
                 in[i] = in[i] + 1;
             }
             else {
                 in[i]--;
             }
         }

    }

  public static void testForArray() {
      int [] horse = {0, 0, 0, 0, 0};
      array(horse);
      int value = 0;
      for (int i = 0; i < horse.length; i++) {
          value += horse[i];

      }
      if (horse.length % 2 == 0) {
          assert value == 0;
      }
      else {
          assert value == 1;
      }
    }
}
//int a = b % c

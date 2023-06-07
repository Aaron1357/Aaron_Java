package com.kh.practice2;

import java.util.HashSet;

public class Application {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        long count = 0;
            for (int i = 0; set.size() < 6; i++) {
                int num = (int) (Math.random() * 45 + 1);
                set.add(num);
            }
                  
   
            while(!set.equals(set2)) {
              set2.clear();
              count++;
            for (int i = 0; set2.size() < 6; i++) {
                int num = (int) (Math.random() * 45 + 1);
                set2.add(num);
                
                
            }


            System.out.println("로또 번호: " + set);
            System.out.println("내 번호: " + set2);
            System.out.println("시도 횟수:" + count);
     

          
            }
        }
    }


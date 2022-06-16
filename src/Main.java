import algorithm.MaxWaterArea;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        int []arr = {4,8,1,2,3,9};
        int targer = 11;



//      1  System.out.println("Answwer is here"+ Arrays.toString(uptimizedToTargetSumIndex(arr, targer)));

//        2 waterArea Solution,

        System.out.println(MaxWaterArea.maxWaterAreaUptimizeSolution(arr) + "let See Solution");




    }


    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);

        int left = 0;
        int right = array.length -1;

        while (left  < right){
            int currentNumber = array[left] + array[right];

            if (currentNumber == targetSum){
                System.out.println("LEft" + left +"Right" + right);
                return new int[]{array[left], array[right]};
            }
            else if (currentNumber < targetSum){
                left++;
            }
            else if(currentNumber > targetSum){
                right--;
            }
        }
        return  new int[0];
    }

    public static int[] loopInteger(int [] numbers, int tergetNum){


        for (int p1 = 0; p1< numbers.length; p1++){
            int second = tergetNum - numbers[p1];
            for (int p2 = p1+1; p2 < numbers.length; p2++){
                if (second == numbers[p2]){
                        return new int[]{p1, p2};
                }
            }

        }

        return new int[0];
    }

    public static int[] uptimizedToTargetSumIndex(int [] numbers, int tergetNum){

        Map<Integer, Integer> findMap = new HashMap<>();
        for (int pi =0;  pi < numbers.length; pi++ ){

            if (findMap.containsKey(numbers[pi])){
                System.out.println(findMap + "Oopss");
                return new int[]{findMap.get(numbers[pi]), pi};
            }
            else {
                int find = tergetNum -numbers[pi];
                findMap.put(find, pi);
            }
        }
        return null;
    }


    }
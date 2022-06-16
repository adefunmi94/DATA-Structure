package algorithm;

public class MaxWaterArea {




    public static int maxWaterAreaBruteForce(int [] heights){
        int maxArea = 0;
        for (int pi = 0; pi< heights.length; pi++){
            for (int p2 = pi+1; p2< heights.length; p2++){
                int minNum = Math.min(heights[pi], heights[p2]);
                int distance= p2 -pi;
              int area = minNum * distance;

              maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

//    shifting Pointer

    public static int maxWaterAreaUptimizeSolution(int [] heights) {
        int p1 = 0, p2 = heights.length-1, maxArea =0;

        while (p1 < p2){
            int heigth = Math.min(heights[p1],heights[p2]);
            int width = p2 -p1 ;
            int area = heigth * width;
            maxArea = Math.max(maxArea, area);
            if (heights[p1] <= heights[p2]){
                p1++;
            }
            else {
                p2--;
            }
        }
        return maxArea;
    }
}

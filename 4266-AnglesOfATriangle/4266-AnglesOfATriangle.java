// Last updated: 7/12/2026, 12:16:17 AM
class Solution {
    public double[] internalAngles(int[] side) {
        int s=(side[0]+side[1]+side[2])/2;
        double area=Math.sqrt(s*(s-side[0])*(s-side[1])*(s-side[2]));
        if(side[0] + side[1] <= side[2] ||
   side[1] + side[2] <= side[0] ||
   side[0] + side[2] <= side[1]) {
    return new double[]{};
}
        double[] angle=new double[3];
        angle[0]=find(side[0],side[1],side[2]);
        angle[1]=find(side[1],side[0],side[2]);
        angle[2]=find(side[2],side[1],side[0]);
        Arrays.sort(angle);
        return angle;
    }
   public static double find(int a, int b, int c){
    double cosA = (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2.0 * b * c);

    //Fix: clamp value
    cosA = Math.max(-1.0, Math.min(1.0, cosA));

    return Math.toDegrees(Math.acos(cosA));
}
}
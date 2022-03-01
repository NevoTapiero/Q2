public class Q2  {
    public static void main(String[] args) {
        int [] a = new int[71];
        for(int i = 0; i < a.length;i++) {
            a[i] = (int) (Math.random() * (50-(-50) + 1))-50;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        q2(a);
    }

    public static void q2(int[] arr){
        int[]a = new int[3];
        a[0] = (arr[0] + arr[1]);
        a[1] = 0;
        a[2] = 1;
        for(int i = 1;i < arr.length-1 ;i++){
            if((arr[i] + arr[i + 1]) > a[0]) {
                a[0] = arr[i] + arr[i + 1];
                a[1] = i;
                a[2] = i + 1;
            }
        }
        System.out.println("");
        System.out.println(a[1] + " " + a[2]);
        System.out.println(a[0]);
    }
}

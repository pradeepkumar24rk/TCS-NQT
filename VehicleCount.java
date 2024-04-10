public class VehicleCount {
    public static void main(String[] args) {
        int v = 200, w = 540;
        if (v<w && w%2 ==0 && w>=2){
            int vv = (w-(2*v))/2, wv = v - vv;
            System.out.println("Total 2-Wheeler = "+vv+"\nTotal 4-Wheeler = "+wv);
        } else 
            System.out.println("Invalid Input");
    }
}

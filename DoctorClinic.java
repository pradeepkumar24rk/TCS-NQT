public class DoctorClinic {
    public static void main(String[] args) {
        int ageOfPatients[] = {18, 21, 45, 60, 87, 22, 10, 12};
        int sum = 0, n = ageOfPatients.length;
        if(n>20)
            System.out.print("Doctor only visit 20 patients a day");
        else {
            for(int i = 0;i<n;i++) {
                if(ageOfPatients[i]<120 ){
                    if(ageOfPatients[i]<17)
                        sum+=200;
                    else if(ageOfPatients[i]>17 && ageOfPatients[i]<40)
                        sum+=400;
                    else
                        sum+=300;
                }
            }
            System.out.println(sum);
        }
    }
}

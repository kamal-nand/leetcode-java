import java.util.*;

public class CarFleet {

    public static int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1)
            return 1;

        HashMap<Integer, Integer> posSpeed = new HashMap<>();

        for (int i = 0; i < speed.length; i++) {
            posSpeed.put(position[i], speed[i]);
        }

        Arrays.sort(position);
        int fleetNum = speed.length;
        
        int a = target - position[speed.length - 1];
        double b = posSpeed.get(position[speed.length - 1]);
        double max = a/ b;

        for (int i = speed.length - 2; i >= 0; i--) {
            int currCar = position[i];
            double distToFinish = (double) (target - currCar) / (double) posSpeed.get(currCar);

            if (distToFinish > max) {
                max = distToFinish;
                continue;
            }

            fleetNum--;
        }
        return fleetNum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int target = sc.nextInt();
            int sizeOfArrays = sc.nextInt();

            int[] position = new int[sizeOfArrays];
            for (int i = 0; i < sizeOfArrays; i++) {
                position[i] = sc.nextInt();
            }

            int[] speed = new int[sizeOfArrays];
            for (int i = 0; i < sizeOfArrays; i++) {
                speed[i] = sc.nextInt();
            }

            int res = carFleet(target, position, speed);
            System.out.println(res);
        }
    }
}

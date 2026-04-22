class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2];
        for(int i = 0; i < position.length; i++) {
            cars[i] = new double[] { position[i], speed[i] };
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> fleets = new Stack();

        for(double[] car: cars) {
            double pos = car[0];
            double spd = car[1];

            double timeTaken = (double)((target - pos) / spd);

            if(fleets.isEmpty() || timeTaken > fleets.peek()) {
                fleets.push(timeTaken);
            }
        }

        return fleets.size();
    }
}

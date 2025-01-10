public class Main {
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D();
        vector1.setCoordinate(3.2, 1.5, 5.2);

        System.out.println(vector1.getX());
        System.out.println(vector1.getY());
        System.out.println(vector1.getZ());
    }

    public static class Vector3D {
        Double x = 0.0;
        Double y = 0.0;
        Double z = 0.0;

        // 1
        public void setCoordinate(Double x, Double y, Double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // 2
        public Double getX() {
            return x;
        }

        public Double getY() {
            return y;
        }

        public Double getZ() {
            return z;
        }
    }
}

